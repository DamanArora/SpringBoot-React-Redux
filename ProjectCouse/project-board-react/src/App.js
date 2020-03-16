import React, { Component } from 'react';
import "bootstrap/dist/css/bootstrap.min.css"
import NavBar from './components/NavBar';
import ProjectBoard from './components/ProjectBoard';
import {BrowserRouter as Router, Route} from 'react-router-dom';
import AddProjecTask from './components/ProjectTask/AddProjecTask';
import store from './store'
import {Provider} from 'react-redux'
import UpdateProjecTask from './components/ProjectTask/UpdateProjecTask';

class App extends Component {
  render(){
    return (
      <Provider store = {store}>
        <Router>
        <div className="App">
          <NavBar/>
          <Route exact path="/" component={ProjectBoard}/>
          <Route exact path="/addProjectTask" component={AddProjecTask}/>
          <Route exact path="/updateProjectTask/:pt_id" component={UpdateProjecTask}/>
        </div>
        </Router>
      </Provider>
    ); 
  }
}

export default App;

