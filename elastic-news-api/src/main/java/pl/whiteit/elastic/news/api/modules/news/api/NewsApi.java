package pl.whiteit.elastic.news.api.modules.news.api;


import pl.whiteit.elastic.news.api.modules.news.model.NewsView;
import pl.whiteit.elastic.news.common.exception.ServerException;
import pl.whiteit.elastic.news.common.rest.Response;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/news")
public interface NewsApi {

    @GET
    @Path("/top")
    @Produces(MediaType.APPLICATION_JSON)
    Response<NewsView> getTopNews() throws ServerException;
}
