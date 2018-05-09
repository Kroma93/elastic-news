package pl.whiteit.elastic.news.integration.news.api;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import pl.whiteit.elastic.news.common.config.Configuration;

public class NewsApiBuilder {

    private ResteasyClient resteasyClient;
    private Configuration configuration;


    private NewsApiBuilder(Configuration configuration){
        this.configuration = configuration;
    }

    public static NewsApiBuilder create(Configuration configuration){
        return new NewsApiBuilder(configuration);
    }


    public NewsApiBuilder build(){
        resteasyClient = new ResteasyClientBuilder().build();
        return this;
    }


    public NewsApi createTarget(){
        System.out.println(resteasyClient);
        return resteasyClient.target(configuration.getNewsApiUrl()).proxy(NewsApi.class);
    }
}
