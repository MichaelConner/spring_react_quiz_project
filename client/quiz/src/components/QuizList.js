import React, {Component} from 'react';
import QuizTile from '../components/QuizTile'

class QuizList extends Component {
    render(){
      
        const quizTiles = this.props.quizzes.map(quiz => {
            return(
                <QuizTile key= {quiz.id} id={quiz.id} category={quiz.category}/>
            )
        })

        return(
            <div className="quiz-list">
                <h2>Hi I am the Quiz List!</h2>
                {quizTiles}
            </div>
        )
    }
} 

export default QuizList;