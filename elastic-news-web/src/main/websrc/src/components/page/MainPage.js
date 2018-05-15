import React, {Component} from 'react';
import NavBar from '../navbar/NavBar'
import NewsTopContainer from "../news/top/NewsTopContainer";


export default class MainPage extends Component {
  constructor(props) {
    super(props);

  }

  render() {
    return (
      <div>
        <NavBar/>
        <main role="main" className="py-5">
          <div className="container">
            <NewsTopContainer/>
          </div>
        </main>
      </div>
    );
  }
}
