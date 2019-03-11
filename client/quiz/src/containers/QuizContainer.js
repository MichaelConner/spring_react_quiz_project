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
            questions: [
                {id: 1, question: "hello?", answer: "hiya"},
                {id: 2, question: "hello?", answer: "hiya"},
                {id: 3, question: "hello?", answer: "hiya"}
            ]
        };
        this.handleQuizSelected = this.handleQuizSelected.bind(this);
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

render(){
    return(
        <Router>
            <Fragment>
                <QuizHeader/>
                    <Switch>
                        
                        <Route exact path="/" 
                               render={() => <QuizList quizzes={this.state.quizzes} onQuizSelected={this.handleQuizSelected}/>}/>
                        
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
