require('styles/App.css');

import React, {Component} from 'react';
import NewsPage from './page/NewsPage';


export default class App extends Component {

  render() {
    return (
        <div>
          <NewsPage/>
        </div>
    )
  }
}
