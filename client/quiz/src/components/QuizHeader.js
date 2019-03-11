import React, {Component, Fragment} from 'react';
import SearchInput from './SearchInput';

class QuizHeader extends Component {
    render(){
        
        return(
            <Fragment>
                <div className='quiz-header'>
                    <h2>Hi I am the Quiz Header!</h2>
                    <SearchInput value={this.props.value} onChange={this.props.onChange}/>
                </div>
            </Fragment>
        )
    }
} 

export default QuizHeader;