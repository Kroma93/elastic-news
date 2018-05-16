package pl.whiteit.elastic.news.web.core.news.service;

import pl.whiteit.elastic.news.api.modules.news.model.NewsView;
import pl.whiteit.elastic.news.common.enums.CategoryNews;
import pl.whiteit.elastic.news.integration.news.model.NewsApiRequest;
import pl.whiteit.elastic.news.integration.news.model.NewsApiResponse;
import pl.whiteit.elastic.news.integration.news.service.NewsApiService;
import pl.whiteit.elastic.news.web.core.news.mapper.NewsResponseToViewMapper;

import javax.inject.Inject;
import java.util.List;

public class TopNewsService {

    @Inject
    private NewsApiService newsService;

    @Inject
    private NewsResponseToViewMapper newsResponseToViewMapper;

    public List<NewsView> getTopNews(){
        NewsApiResponse newsResponse = newsService.getNewsFromNewsApi(prepareRequestToTop());
        return mapToView(newsResponse);

    }

    private List<NewsView> mapToView(NewsApiResponse newsResponse){
        return newsResponseToViewMapper.mapToView(newsResponse);
    }

    private NewsApiRequest prepareRequestToTop(){
        NewsApiRequest newsApiRequest = new NewsApiRequest();
        newsApiRequest.category = CategoryNews.HEALTH;
        return newsApiRequest;
    }
}
