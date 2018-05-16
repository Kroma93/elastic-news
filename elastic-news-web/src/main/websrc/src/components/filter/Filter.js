import React, {Component} from 'react';
import CategoryFilterContainer from "./category/CategoryFilterContainer";

export default class Filter extends Component {
  constructor(props) {
    super(props);

  }

  render() {
    let {value,updateFilter} = this.props;

    return (
      <div className="row">
        <div className="col-12">
          <form>
            <CategoryFilterContainer filter={value} updateFilter={updateFilter}/>
          </form>
        </div>
      </div>
    );
  }
}
