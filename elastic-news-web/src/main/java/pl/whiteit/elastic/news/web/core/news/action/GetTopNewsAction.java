package pl.whiteit.elastic.news.web.core.news.action;

import pl.whiteit.elastic.news.api.modules.news.model.NewsView;
import pl.whiteit.elastic.news.common.action.BaseAction;
import pl.whiteit.elastic.news.common.exception.ServerException;
import pl.whiteit.elastic.news.common.rest.Response;
import pl.whiteit.elastic.news.web.core.news.service.TopNewsService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class GetTopNewsAction extends BaseAction<NewsView> {


    @Inject
    private TopNewsService topNewsService;

    @Override
    public Response<NewsView> execute() throws ServerException {
        createResponse();
        response.data = topNewsService.getTopNews();
        return response;
    }
}
