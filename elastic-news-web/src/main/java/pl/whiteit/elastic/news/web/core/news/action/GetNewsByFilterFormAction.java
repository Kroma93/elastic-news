package pl.whiteit.elastic.news.web.core.news.action;

import pl.whiteit.elastic.news.api.modules.news.model.NewsView;
import pl.whiteit.elastic.news.common.action.BaseAction;
import pl.whiteit.elastic.news.common.exception.ServerException;
import pl.whiteit.elastic.news.common.rest.Response;
import pl.whiteit.elastic.news.api.modules.news.model.form.FilterForm;
import pl.whiteit.elastic.news.web.core.news.service.NewsByFilterService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class GetNewsByFilterFormAction extends BaseAction<NewsView> {


    @Inject
    private NewsByFilterService newsByFilterService;

    private FilterForm filterForm;

    @Override
    public Response<NewsView> execute() throws ServerException {
        createResponse();
        response.data = newsByFilterService.getNewsByFilter(filterForm);
        return response;
    }

    public void setFilterForm(FilterForm filterForm) {
        this.filterForm = filterForm;
    }
}
