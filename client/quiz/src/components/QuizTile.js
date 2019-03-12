import React, {Component} from 'react';
import {Link} from 'react-router-dom'; 

class QuizTile extends Component {
    render(){

        return(
            <div className="quiz-tile">
                <p>Placeholder for img</p>
                <h4>{this.props.id}: {this.props.category}</h4>
                <p><button className="delete-button" type="delete-button" > delete</button></p>
                
                <Link to={`quiz/${this.props.id}`} 
                onClick={() => {this.props.onChange(`${this.props.id}`)}}
                >Link to actual quiz</Link>

            </div>
        )
    } 
}

export default QuizTile;