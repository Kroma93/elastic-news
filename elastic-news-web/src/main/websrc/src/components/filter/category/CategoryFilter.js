import React, {Component} from 'react';

export default class CategoryFilter extends Component {
  constructor(props) {
    super(props);

  }

  change(event){
    let {filter,updateFilter} = this.props;
    let updatedFiltered = filter;
    updatedFiltered.category = event.target.value
    updateFilter(updatedFiltered)
  }

  render() {
    let {categoryList, filter} = this.props;

    let renderOptions = categoryList.map((category, index) => {
      return (
        <option key={index} value={category.value}>{category.name}</option>
      )
    });
    return (
      <div className="form-group">
        <label htmlFor="category">Kategoria artykułów</label>
        <select className="form-control" id="category" value={filter.category} onChange={this.change.bind(this)}>
          {renderOptions}
        </select>
      </div>
    );
  }
}
