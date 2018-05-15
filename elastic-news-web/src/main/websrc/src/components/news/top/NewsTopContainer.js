/* eslint no-console: 0*/

import React, {Component} from 'react';
import 'whatwg-fetch';
import Filter from "../../filter/Filter";
import NewsTop from "./NewsTop";


const API_HEADERS = {
  'Content-Type': 'application/json',
  'Accept': 'application/json'
};


export default class NewsTopContainer extends Component {
  constructor() {
    super(...arguments);
    this.state = {
      news : [],
      filter: {
        category: "TECHNOLOGY"
      }
    }
  }



  componentDidMount() {
    this.getData();
  }

  getData() {
    fetch('/elastic-news/api/news/by-filter', {method: 'POST', headers: API_HEADERS,body: JSON.stringify(this.prepareRequest())})
      .then((response) => response.json())
      .then((responseData) => {
        let newsUpdated = this.state.news;
        newsUpdated=responseData.data;
        this.setState({news: newsUpdated});

      })
      .catch(() => {
      });
  }

  prepareRequest(){
    let request = this.state.filter;
    return request;
  }

  updateFilter(filterUpdated){
    this.setState({filter: filterUpdated});
    console.log(filterUpdated);
    this.getData();
  }



  render() {
    return(
      <div>
        <Filter value={this.state.filter} updateFilter={this.updateFilter.bind(this)}/>
        <NewsTop listNews={this.state.news}/>*
      </div>
    )
  }
}
