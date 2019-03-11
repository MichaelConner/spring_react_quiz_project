import React, {Component} from 'react';

class QuizTile extends Component {
    render(){
        return(
            <div className="quiz-tile">
                <p>Placholder for img</p>
                <h4>{this.props.id}: {this.props.category}</h4>
                <p>Placeholder for Delete button</p>
                <a href="https://google.com">Link to actual quiz</a>
            </div>
        )
    } 
}

export default QuizTile;