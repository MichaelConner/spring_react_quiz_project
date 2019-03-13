import React, {Component} from 'react';
import {Link} from 'react-router-dom';

class SubmitQuiz extends Component{

    render(){
        return(
            <div className='submit-form-page'>
           
                <p></p>
                <form className="submit-form" onSubmit={this.props.submitQuiz}>
                <h1>Submit your quiz details below:</h1>
                <p>
                <label>What category is your quiz?</label>
                <input id="category" name="category"></input>
                </p>

                <p>
                <label>What image would you like to represent your quiz?</label>
                <input id="imgurl" name="imgurl"></input>
                </p>

                <p>
                <label>What is your first question?</label>
                <input id="question1" name="question1"></input>
                </p>

                <p>
                <label>What is the answer to your first question?</label>
                <input id="answer1" name="answer1"></input>
                </p>

                <button type="text" className='submit-quiz-button'>Submit</button>
                <h4><Link to="/">oo| surface back to the home page</Link></h4>
                </form>
                <p></p>
            
            </div>
        )
    }
}

export default SubmitQuiz;