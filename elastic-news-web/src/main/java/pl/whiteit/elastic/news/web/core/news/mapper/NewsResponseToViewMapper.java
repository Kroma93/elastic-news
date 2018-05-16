package pl.whiteit.elastic.news.web.core.news.mapper;

import pl.whiteit.elastic.news.api.modules.news.model.NewsView;
import pl.whiteit.elastic.news.integration.news.model.NewsApiResponse;

import java.util.List;
import java.util.stream.Collectors;

public class NewsResponseToViewMapper {

    public List<NewsView> mapToView(NewsApiResponse newsResponse){
        return newsResponse.articles.stream().map(article -> NewsViewByNewsArticleResponseMapper.create().articleResponse(article).map()).collect(Collectors.toList());
    }
}
