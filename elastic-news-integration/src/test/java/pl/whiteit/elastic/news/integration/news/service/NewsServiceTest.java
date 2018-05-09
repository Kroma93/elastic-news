package pl.whiteit.elastic.news.integration.news.service;

import org.junit.Test;
import pl.whiteit.elastic.news.integration.news.model.NewsApiRequest;
import pl.whiteit.elastic.news.integration.news.model.NewsApiResponse;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class NewsServiceTest {

    @Test
    public void getNewsFromNewsApi() {
        NewsService newsService = new NewsService();
        NewsApiResponse newsFromNewsApi = newsService.getNewsFromNewsApi(new NewsApiRequest());
        assertNotNull(newsFromNewsApi);
        assertEquals("ok",newsFromNewsApi.status);
    }
}