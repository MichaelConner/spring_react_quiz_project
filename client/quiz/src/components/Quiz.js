import React, {Component, Fragment} from 'react';
import {Link} from 'react-router-dom';

class Quiz extends Component {
    constructor(props){
        super(props);
        this.state = {
            questions: [] 
        };
        this.handleUserInput = this.handleUserInput.bind(this);
    }
    
    componentDidMount(){
        const id = this.props.currentQuizId
        const url = `http://localhost:8080/quizzes/${id}/questions/`;
        fetch(url)
            .then(res => res.json())
            .then(data => this.setState({questions: data}))
    }

    handleUserInput (e) {
        const name = e.target.name;
        const value = e.target.value;
        this.setState({[name]: value});
      }

    render(){

        const questions = this.state.questions.map(question => {
            return(
                <section key={question.id}>  
                
                <label htmlFor="question">{question.question}</label>
                
                <input type="text" 
                       className="answer" 
                       name={question.id} 
                       value={this.state.value}
                       onChange={this.handleUserInput}
                       /> 
                
                </section>
            )
        })

        return(
                <Fragment>
                    <article className='quiz'>  
                        <h2>Quiz</h2>
                        <form>       
                            {questions}
                            <button type="submit" className="answer-button">Submit Answers</button>
                        </form>
                        <Link to="/">back</Link>
                    </article>
                </Fragment>
        )
    } 
}

export default Quiz;