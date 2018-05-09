package pl.whiteit.elastic.news.integration.news.service;

import pl.whiteit.elastic.news.common.config.ConfigurationImpl;
import pl.whiteit.elastic.news.integration.news.api.NewsApi;
import pl.whiteit.elastic.news.integration.news.api.NewsApiBuilder;
import pl.whiteit.elastic.news.integration.news.model.NewsApiRequest;
import pl.whiteit.elastic.news.integration.news.model.NewsApiResponse;

public class NewsApiService {

    public NewsApiResponse getNewsFromNewsApi(NewsApiRequest newsApiRequest){
        NewsApi api = NewsApiBuilder.create(new ConfigurationImpl()).build().createTarget();
        return api.getNews(newsApiRequest);
    }
}
