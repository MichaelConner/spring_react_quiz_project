import React, {Component} from 'react';
import QuizHeader from '../components/QuizHeader'
import QuizList from '../components/QuizList'

class QuizContainer extends Component{
    constructor(props){
        super(props);
        this.state = {
            quizzes: [],
            currentQuiz: "Hello"
        };
    }

componentDidMount(){
    const url = "http://localhost:8080/questions/1/"
    fetch(url)
        .then(res => res.json())
        .then(data => this.setState({quizzes: data}))
}

render(){
    return(
        <div className="quiz-container">
            <h2 value>Hi! I am the Container!</h2>
            <QuizHeader/>
            <QuizList quizzes={this.state.quizzes}/>

        </div>
    )
}

}

export default QuizContainer;
