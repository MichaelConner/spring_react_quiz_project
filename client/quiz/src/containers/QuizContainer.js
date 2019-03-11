import React, {Component, Fragment} from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import QuizHeader from '../components/QuizHeader'
import QuizList from '../components/QuizList'
import Quiz from '../components/Quiz'

class QuizContainer extends Component{
    constructor(props){
        super(props);
        this.state = {
            quizzes: [],
            questions: []
        };
        this.handleInputChange = this.handleInputChange.bind(this);
    }

componentDidMount(){
    const url = "http://localhost:8080/quizzes"
    fetch(url)
        .then(res => res.json())
        .then(data => this.setState({quizzes: data}))
}

handleInputChange(e) {
    this.setState({ inputValue: e.target.value })
}

getFilteredList() {
    const filterValue = this.state.inputValue.toLowerCase()
    return this.state.quizzes.filter(({ category }) =>
      category.toLowerCase().includes(filterValue)
    )
}

render(){

    const filteredList = this.state.inputValue
      ? this.getFilteredList()
      : this.state.quizzes 


    return(
        <Router>
            <Fragment>
                <QuizHeader value={this.state.inputValue} 
                            onChange={this.handleInputChange}/>
                    
                    <Switch>  
                        <Route exact path="/" 
                               render={() => <QuizList 
                               quizzes={filteredList} />}
                               />
                        
                        <Route name="quiz" 
                               path="/quiz/:id"
                               render={() => <Quiz />}
                               />
                    </Switch>

            </Fragment>
        </Router>
    )
}

}

export default QuizContainer;
