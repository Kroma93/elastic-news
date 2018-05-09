package pl.whiteit.elastic.news.core.news.service;

import pl.whiteit.elastic.news.api.modules.news.model.NewsView;
import pl.whiteit.elastic.news.integration.news.model.NewsApiArticleResponse;

public class NewsViewByNewsArticleResponseMapper {


    private NewsApiArticleResponse articleResponse;

    private NewsViewByNewsArticleResponseMapper(){

    }

    public static NewsViewByNewsArticleResponseMapper create(){
        return new NewsViewByNewsArticleResponseMapper();
    }

    public NewsViewByNewsArticleResponseMapper articleResponse(NewsApiArticleResponse articleResponse){
        this.articleResponse = articleResponse;
        return this;
    }

    public NewsView map(){
        NewsView newsView = new NewsView();

        newsView.description = articleResponse.description;
        newsView.title = articleResponse.title;
        newsView.urlToImage = articleResponse.urlToImage;
        return newsView;
    }
}
