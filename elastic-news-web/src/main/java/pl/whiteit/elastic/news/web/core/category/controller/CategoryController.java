package pl.whiteit.elastic.news.web.core.category.controller;

import pl.whiteit.elastic.news.api.modules.news.api.CategoryApi;
import pl.whiteit.elastic.news.api.modules.news.api.NewsApi;
import pl.whiteit.elastic.news.api.modules.news.model.CategoryView;
import pl.whiteit.elastic.news.api.modules.news.model.NewsView;
import pl.whiteit.elastic.news.common.exception.ServerException;
import pl.whiteit.elastic.news.common.rest.Response;
import pl.whiteit.elastic.news.web.core.category.action.GetCategoryAllAction;
import pl.whiteit.elastic.news.web.core.news.action.GetTopNewsAction;

import javax.inject.Inject;

public class CategoryController implements CategoryApi {

    @Inject
    private GetCategoryAllAction getCategoryAllAction;

    @Override
    public Response<CategoryView> getCategoryAll() throws ServerException {
        return getCategoryAllAction.execute();
    }
}

