import React, {Component, Fragment} from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import QuizHeader from '../components/QuizHeader'
import QuizList from '../components/QuizList'
import Quiz from '../components/Quiz'
import SubmitQuiz from '../components/SubmitQuiz';

class QuizContainer extends Component{
    constructor(props){
        super(props);
        this.state = {
            quizzes: [],
            questions: [],
            inputValue: '',
            currentQuizId: null
        };
        this.handleInputChange = this.handleInputChange.bind(this);
        this.handleCurrentQuizChange = this.handleCurrentQuizChange.bind(this);
        this.handleDeleteQuiz = this.handleDeleteQuiz.bind(this);
        this.handleSubmitQuiz = this.handleSubmitQuiz.bind(this);
    }

componentDidMount(){
    const url = "http://localhost:8080/quizzes"
    fetch(url)
        .then(res => res.json())
        .then(data => this.setState({quizzes: data}))
}

handleInputChange(event) {
    this.setState({ inputValue: event.target.value })
}

handleCurrentQuizChange(id) {
    this.setState({ currentQuizId: id })
}

handleDeleteQuiz(id){
    const url = `http://localhost:8080/quizzes/${id}`
    return fetch(url, {method: 'DELETE'})
            .then(res=> res)
            .then((data) => {
                
                const filteredQuizzes = this.state.quizzes.filter((quiz) => {
                return parseInt(id) !== quiz.id;
                })
            
                return this.setState({quizzes: filteredQuizzes}
            );
        })
} 

handleSubmitQuiz(event){

        console.log(event) 

        event.preventDefault();
        event.persist();

        const quizData= { category: `${event.target.category.value}`,
                          imgurl: `${event.target.imgurl.value}`
        }

        console.log(quizData)
   
        const url2 = `http://localhost:8080/quizzes`
        return fetch(url2, {method: 'POST', 
                     headers: {'Content-Type': 'application/json',
                     'Accept': 'application/json' }, 
                     body: JSON.stringify(quizData)})
            .then(res=> res)
            .then((returnedData) => {
                
            const updatedQuizzes = [...this.state.quizzes, returnedData]
            return this.setState({quizzes: updatedQuizzes})
            })
            .then(()=>{  
              
        console.log(event.target) 
        console.log(this.state.quizzes)   

            const question1Data = { question: `${event.target.question1.value}`,
                  answer: `${event.target.answer1.value}`,
                  quiz: {category: `${event.target.category.value}`,
                        imgurl: `${event.target.imgurl.value}`,
                        id: this.state.quizzes.length
                }}

            console.log(question1Data)

            const url = `http://localhost:8080/questions`
            return fetch(url, {method: 'POST', 
                              headers: {'Content-Type': 'application/json',
                              'Accept': 'application/json' }, 
                              body: JSON.stringify(question1Data)})
            })
            
        }





getFilteredList() {
    const filterValue = this.state.inputValue.toLowerCase()
    return this.state.quizzes.filter(({ category }) =>
      category.toLowerCase().includes(filterValue)
    )
}

render(){

    const filteredList = this.state.inputValue
      ? this.getFilteredList()
      : this.state.quizzes 


    return(
        <Router>
            <Fragment>
                <QuizHeader value={this.state.inputValue} 
                            onChange={this.handleInputChange}/>
                    
                    <Switch>  
                        <Route exact path="/" 
                               render={() => <QuizList 
                               quizzes={filteredList} 
                               onChange={this.handleCurrentQuizChange} 
                               onDelete={this.handleDeleteQuiz}/>}
                               />
                        
                        <Route name="quiz" 
                               path="/quiz/:id"
                               render={() => <Quiz 
                               currentQuizId={this.state.currentQuizId}/>}
                               />

                        <Route name="submit-quiz" 
                               path="/submit-quiz"
                               render={() => <SubmitQuiz 
                               submitQuiz={this.handleSubmitQuiz} 
                               currentQuizId={this.state.currentQuizId}/>}
                               />
                    </Switch>

            </Fragment>
        </Router>
    )
}

}

export default QuizContainer;
