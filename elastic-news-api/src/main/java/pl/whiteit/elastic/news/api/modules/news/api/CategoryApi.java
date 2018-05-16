package pl.whiteit.elastic.news.api.modules.news.api;

import pl.whiteit.elastic.news.api.modules.news.model.CategoryView;
import pl.whiteit.elastic.news.api.modules.news.model.NewsView;
import pl.whiteit.elastic.news.common.exception.ServerException;
import pl.whiteit.elastic.news.common.rest.Response;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/category")
public interface CategoryApi {

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    Response<CategoryView> getCategoryAll() throws ServerException;
}
