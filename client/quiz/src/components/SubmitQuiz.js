import React, {Component} from 'react';

class SubmitQuiz extends Component{

    render(){
        return(
            <div>
                <form onSubmit={this.props.submitQuiz}>
                <h1>Quiz Submit Form</h1>
                <input id="category" name="category"></input>
                <input id="imgurl" name="imgurl"></input>

                <input id="question1" name="question1"></input>
                <input id="answer1" name="answer1"></input>

                <button type="text">Submit</button>
                </form>
            </div>
        )
    }

}

export default SubmitQuiz;