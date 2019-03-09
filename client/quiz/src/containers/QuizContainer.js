import React, {Component} from 'react';

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
        <div className="quizzes">
            <h2>Hi! I came from the DB:</h2>
            <p>{this.state.currentQuiz}</p>
        </div>
    )
}

}

export default QuizContainer;
