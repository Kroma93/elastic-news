import React, {Component} from 'react';


export default class NewsTop extends Component {
  constructor(props) {
    super(props);
  }

  render() {
    let {listNews} = this.props;

    let renderListNews = listNews.map((news, index) => {
      return (

        <div className="col-4 py-1" key={index}>
          <div className="card box-shadow">
            <img className="card-img-top" src={news.urlToImage} alt="Card image cap"/>
            <div className="card-body">
              <h5 className="card-title">{news.title} {index}</h5>
              <p className="card-text">{news.description} </p>
              <a href={news.url} target="_blank" className="btn btn-primary">Zobacz więcej</a>
            </div>
          </div>
        </div>

      )
    });

    return (
      <div className="row">
        {renderListNews}
      </div>

    );
  }
}
