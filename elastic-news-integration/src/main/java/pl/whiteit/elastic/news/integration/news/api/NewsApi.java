package pl.whiteit.elastic.news.integration.news.api;


import pl.whiteit.elastic.news.integration.news.model.NewsApiRequest;
import pl.whiteit.elastic.news.integration.news.model.NewsApiResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/top-headlines")
public interface NewsApi {

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    NewsApiResponse getNews(@BeanParam NewsApiRequest request);
}
