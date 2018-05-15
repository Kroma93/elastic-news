package pl.whiteit.elastic.news.web.core.category.action;

import pl.whiteit.elastic.news.api.modules.news.model.CategoryView;
import pl.whiteit.elastic.news.api.modules.news.model.NewsView;
import pl.whiteit.elastic.news.common.action.BaseAction;
import pl.whiteit.elastic.news.common.exception.ServerException;
import pl.whiteit.elastic.news.common.rest.Response;
import pl.whiteit.elastic.news.web.core.category.service.CategoryService;
import pl.whiteit.elastic.news.web.core.news.service.TopNewsService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class GetCategoryAllAction extends BaseAction<CategoryView> {


    @Inject
    private CategoryService categoryService;

    @Override
    public Response<CategoryView> execute() throws ServerException {
        createResponse();
        response.data = categoryService.getAll();
        return response;
    }
}
