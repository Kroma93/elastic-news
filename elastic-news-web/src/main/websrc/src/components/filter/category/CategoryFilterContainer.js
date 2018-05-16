/* eslint no-console: 0*/

import React, {Component} from 'react';
import 'whatwg-fetch';
import CategoryFilter from "./CategoryFilter";


const API_HEADERS = {
  'Content-Type': 'application/json',
  'Accept': 'application/json'
};


export default class CategoryFilterContainer extends Component {
  constructor() {
    super(...arguments);
    this.state = {
      categoryList : []
    }
  }



  componentDidMount() {
    this.getData();
  }

  getData() {
    fetch('/elastic-news/api/category/all', {method: 'GET', headers: API_HEADERS})
      .then((response) => response.json())
      .then((responseData) => {
        let categoryListUpdated = this.state.categoryList;
        categoryListUpdated=responseData.data;
        this.setState({categoryList: categoryListUpdated});

      })
      .catch(() => {
      });
  }




  render() {
    let {filter,updateFilter} = this.props;

    return <CategoryFilter categoryList={this.state.categoryList} filter={filter} updateFilter={updateFilter}/>
  }
}
