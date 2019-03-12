import React, {Component, Fragment} from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import QuizHeader from '../components/QuizHeader'
import QuizList from '../components/QuizList'
import Quiz from '../components/Quiz'

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
    return fetch(url, {
        method: 'DELETE'
        // mode:  'CORS'
    }).then(res=> res)
    // }).catch(err => err);
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
                    </Switch>

            </Fragment>
        </Router>
    )
}

}

export default QuizContainer;
