package pl.whiteit.elastic.news.web.core.news.controller;

import pl.whiteit.elastic.news.api.modules.news.api.NewsApi;
import pl.whiteit.elastic.news.api.modules.news.model.NewsView;
import pl.whiteit.elastic.news.api.modules.news.model.form.FilterForm;
import pl.whiteit.elastic.news.common.exception.ServerException;
import pl.whiteit.elastic.news.common.rest.Response;
import pl.whiteit.elastic.news.web.core.news.action.GetNewsByFilterFormAction;
import pl.whiteit.elastic.news.web.core.news.action.GetTopNewsAction;

import javax.inject.Inject;

public class NewsController implements NewsApi {

    @Inject
    private GetTopNewsAction getTopNewsAction;

    @Inject
    private GetNewsByFilterFormAction getNewsByFilterFormAction;

    @Override
    public Response<NewsView> getTopNews() throws ServerException {
        return getTopNewsAction.execute();
    }

    @Override
    public Response<NewsView> getNewsByFilter(FilterForm filterForm) throws ServerException {
        getNewsByFilterFormAction.setFilterForm(filterForm);
        return getNewsByFilterFormAction.execute();
    }


}

