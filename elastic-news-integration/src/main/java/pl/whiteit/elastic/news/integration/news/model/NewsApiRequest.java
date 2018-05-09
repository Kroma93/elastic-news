package pl.whiteit.elastic.news.integration.news.model;


import javax.ws.rs.QueryParam;

public class NewsApiRequest {

    @QueryParam("country")
    public String country = "pl";

    @QueryParam("category")
    public String category = "technology";

    @QueryParam("apiKey")
    public String apiKey = "e2806a1083d94fc38d55f4b43e63abd8";


}
