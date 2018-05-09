package pl.whiteit.elastic.news.core.news.controller;

import pl.whiteit.elastic.news.api.modules.news.api.NewsApi;
import pl.whiteit.elastic.news.api.modules.news.model.NewsView;
import pl.whiteit.elastic.news.common.exception.ServerException;
import pl.whiteit.elastic.news.common.rest.Response;
import pl.whiteit.elastic.news.core.news.action.GetTopNewsAction;

import javax.inject.Inject;

public class NewsController implements NewsApi {


    @Inject
    private GetTopNewsAction getTopNewsAction;

    @Override
    public Response<NewsView> getTopNews() throws ServerException {
        return getTopNewsAction.execute();
    }
}
