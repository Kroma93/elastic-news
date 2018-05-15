/* eslint no-console: 0*/

import React, {Component} from 'react';
import 'whatwg-fetch';
import NewsTop from './NewsTop'


const API_HEADERS = {
  'Content-Type': 'application/json',
  'Accept': 'application/json'
};


export default class NewsTopContainer extends Component {
  constructor() {
    super(...arguments);
    this.state = {
      news : []
    }
  }



  componentDidMount() {
    this.getData();
  }

  getData() {
    fetch('/elastic-news/api/news/top', {method: 'GET', headers: API_HEADERS})
      .then((response) => response.json())
      .then((responseData) => {
        let newsUpdated = this.state.news;
        newsUpdated=responseData.data;
        this.setState({news: newsUpdated});

      })
      .catch(() => {
      });
  }




  render() {
    return <NewsTop listNews={this.state.news}/>
  }
}
