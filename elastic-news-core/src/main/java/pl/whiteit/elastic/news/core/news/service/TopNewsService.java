package pl.whiteit.elastic.news.core.news.service;

import pl.whiteit.elastic.news.api.modules.news.model.NewsView;
import pl.whiteit.elastic.news.integration.news.model.NewsApiRequest;
import pl.whiteit.elastic.news.integration.news.model.NewsApiResponse;
import pl.whiteit.elastic.news.integration.news.service.NewsApiService;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

public class TopNewsService {

    @Inject
    private NewsApiService newsService;

    public List<NewsView> getTopNews(){
        NewsApiResponse newsResponse = newsService.getNewsFromNewsApi(prepareRequestToTop());
        return mapToView(newsResponse);
    }

    private List<NewsView> mapToView(NewsApiResponse newsResponse){
        return newsResponse.articles.stream().map(article -> NewsViewByNewsArticleResponseMapper.create().articleResponse(article).map()).collect(Collectors.toList());
    }

    private NewsApiRequest prepareRequestToTop(){
        return new NewsApiRequest();
    }
}
