import React, {Component} from 'react';
import {Link} from 'react-router-dom';

class Quiz extends Component {
    constructor(props){
        super(props);
        this.state = {
            questions: [],
            hidden: true
        };
        this.unhideAnswer = this.unhideAnswer.bind(this);
    }
    
    componentDidMount(){
        const id = this.props.currentQuizId
        const url = `http://localhost:8080/quizzes/${id}/questions/`;
        fetch(url)
            .then(res => res.json())
            .then(data => this.setState({questions: data}))
    }

    unhideAnswer() {
        if (!this.state.hidden) {
            this.setState({ hidden : true})
            }else{
            this.setState({ hidden : false})
        }       
    } 

    render(){
        
        const questions = this.state.questions.map(question => {
            return(
                
                <div key={question.id}> 
                
                <h3>{question.id}. {question.question}</h3>
                
                <h3 id={question.id} className={this.state.hidden ? 'hidden' : ''}> {question.answer} </h3>

                </div>
            )
        })

        return(
            <div className="quiz">
                {questions} 
                <p></p>
                <button className="reveal-button" onClick={this.unhideAnswer}>
                    Show/Hide Answers
                </button>
                <p></p>
                <h4><Link to="/">oo| surface back to the home page</Link></h4>
            </div>
       )
    } 
}

export default Quiz;