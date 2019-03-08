import React, {Component} from 'react';

class QuizTile extends Component {
    render(){
        return(
            <div className="quiz-tile">
                <h2>Hi I am the Quiz Tile!</h2>
                <h4>{this.props.id}: {this.props.question}</h4>
            </div>
        )
    } 
}

export default QuizTile;