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
            currentQuiz: null,
            questions: []
        };
        this.handleQuizSelected = this.handleQuizSelected.bind(this);
        this.handleInputChange = this.handleInputChange.bind(this);
    }

componentDidMount(){
    const url = "http://localhost:8080/quizzes"
    fetch(url)
        .then(res => res.json())
        .then(data => this.setState({quizzes: data}))
}

handleQuizSelected(){
    const url = `http://localhost:8080/quizzes/2/questions/`;
    fetch(url)
        .then(res => res.json())
        .then(data => this.setState({questions: data}))
}

handleInputChange(e) {
    this.setState({ inputValue: e.target.value })
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
                               render={() => <QuizList quizzes={filteredList} onQuizSelected={this.handleQuizSelected}/>}/>
                        
                        <Route name="quiz" 
                               path="/quiz/:id"
                               onClick={this.handleQuizSelected()}
                               render={() => <Quiz questions={this.state.questions}/>}/>
                    </Switch>

            </Fragment>
        </Router>
    )
}

}

export default QuizContainer;
