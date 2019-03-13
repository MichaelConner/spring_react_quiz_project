import React, {Component} from 'react';
import {Link} from 'react-router-dom'; 

class QuizTile extends Component {
    render(){

        return(
            <div className="quiz-tile">               
                <Link to={`quiz/${this.props.id}`} 
                      onClick={() => {this.props.onChange(`${this.props.id}`)}}>
                      
                      <div className="image-container">
                        <img src={this.props.img} 
                             alt="tile"
                             width= "100%"
                             height="100%">
                        </img>

                        <button 
                            className="delete-button" 
                            type="image"
                            onClick={() => {this.props.onDelete(`${this.props.id}`)}}>
                        </button>
                    </div>
                    
                </Link>
            </div>
        )
    } 
}

export default QuizTile;