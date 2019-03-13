import React, {Component} from 'react';
import {Link} from 'react-router-dom'; 


class QuizTile extends Component {
    render(){

        return(
            <div className="quiz-tile">
                <img src={process.env.PUBLIC_URL + '/images/' + this.props.img + '.png'} alt="background" />
                <p><button className="delete-button" 
                        type="delete-button"
                        onClick={() => {this.props.onDelete(`${this.props.id}`)}}
                        > delete</button></p>
                
                <Link to={`quiz/${this.props.id}`} 
                onClick={() => {this.props.onChange(`${this.props.id}`)}}
                >Link to actual quiz</Link>

            </div>
        )
    } 
}

export default QuizTile;