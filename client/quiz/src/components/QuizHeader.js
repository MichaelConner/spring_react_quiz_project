import React, {Component, Fragment} from 'react';
import SearchInput from './SearchInput';
import {Link} from 'react-router-dom'; 

class QuizHeader extends Component {
    render(){
        
        return(
            <Fragment>
                <div className='quiz-header'>
                    <h1><Link to="/">oo| Snorkle</Link></h1>
                        <div className='header-objects'>
                            <label>Dive in: </label>
                            <SearchInput value={this.props.value} onChange={this.props.onChange}/>
                            <p></p>
                            <p></p>
                            <Link to="submit-quiz">Click here to share the depths of your knowledge by submitting a new quiz!</Link>
                            <p></p>
                        </div>
                </div>
            </Fragment>
        )
    }
} 

export default QuizHeader;