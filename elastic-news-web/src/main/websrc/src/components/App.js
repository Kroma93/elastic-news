require('styles/App.css');

import React, {Component} from 'react';
import MainPage from './page/MainPage';


export default class App extends Component {

  render() {
    return (
        <div>
          <MainPage/>
        </div>
    )
  }
}
