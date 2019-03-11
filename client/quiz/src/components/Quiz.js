import React, {Component} from 'react';

class Quiz extends Component {
    constructor(props){
        super(props);
        this.state = {
            questions: [],
        };
    }
    
    componentDidMount(){
        const id = 3
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
            </div>
        )
    } 
}

export default Quiz;