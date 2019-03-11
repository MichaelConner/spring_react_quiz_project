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
    }

componentDidMount(){
    const url = "http://localhost:8080/questions"
    fetch(url)
        .then(res => res.json())
        .then(data => this.setState({quizzes: data}))
}

render(){
    return(
        <Router>
            <Fragment>
                <QuizHeader/>
                    <Switch>
                        <Route exact path="/" render={() => <QuizList quizzes={this.state.quizzes}/>}/>
                        <Route name="quiz" path="/quiz/:id" render={() => <Quiz questions={this.state.questions}/>}/>
                    </Switch>
            </Fragment>
        </Router>
    )
}

}

export default QuizContainer;
