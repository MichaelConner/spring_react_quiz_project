import React, {Component} from 'react';
import QuizTile from '../components/QuizTile'

class QuizList extends Component {
    render(){
      
        const quizTiles = this.props.quizzes.map(quiz => {
            return(
                <QuizTile key= {quiz.id} 
                          id={quiz.id} 
                          category={quiz.category} 
                          onChange={this.props.onChange}
                          onDelete={this.props.onDelete}
                          />
            )
        })

        return(
            <div className="quiz-list">
                {quizTiles}
            </div>
        )
    }
} 

export default QuizList;