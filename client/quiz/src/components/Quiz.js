import React, {Component} from 'react';
import {Link} from 'react-router-dom';

class Quiz extends Component {
    constructor(props){
        super(props);
        this.state = {
            questions: [],
        };
    }
    
    componentDidMount(){
        const id = this.props.currentQuizId
        const url = `http://localhost:8080/quizzes/${id}/questions/`;
        fetch(url)
            .then(res => res.json())
            .then(data => this.setState({questions: data}))
    }

    render(){

        const questions = this.state.questions.map(question => {
            return(
                <p key={question.id}> {question.id} : {question.question} {question.answer} </p>
            )
        })

        return(
            <div className="quiz">
                <h2>Hi I am  a Quiz!</h2> 
                {questions} 
                <Link to="/">back</Link>
            </div>
        )
    } 
}

export default Quiz;