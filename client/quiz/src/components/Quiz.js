import React, {Component} from 'react';

class Quiz extends Component {
    render(){

        const questions = this.props.questions.map(question => {
            return(
                <p key={question.id}> {question.id} : {question.question} {question.answer} </p>
            )
        })

        return(
            <div className="quiz">
                <h2>Hi I am Quiz!</h2> 
                {questions} 
            </div>
        )
    } 
}

export default Quiz;