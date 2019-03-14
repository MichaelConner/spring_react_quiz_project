import React, {Component} from 'react';
import {Link} from 'react-router-dom'; 


class QuizTile extends Component {
    render(){

        return(
            <div className="quiz-tile">   
                <Link to={`quiz/${this.props.id}`} 
                onClick={() => {this.props.onChange(`${this.props.id}`)}}>
                <img src={process.env.PUBLIC_URL + '/images/' + this.props.img + '.png'} alt="background" />
                </Link>
                <p>
                    <button className="delete-button" 
                            type="delete-button"
                            onClick={() => {this.props.onDelete(`${this.props.id}`)}}>
                            Delete</button>
                     
                     <button className="difficulty-button" 
                             type="difficulty-button"
                             disabled>
                             Difficulty: {Math.round(this.props.difficulty * 100,0)}%</button>




                </p>
            </div>
        )
    } 
}

export default QuizTile;