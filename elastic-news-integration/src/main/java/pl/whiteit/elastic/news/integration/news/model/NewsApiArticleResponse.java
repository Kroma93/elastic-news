package pl.whiteit.elastic.news.integration.news.model;

import java.util.Date;

public class NewsApiArticleResponse {

    /*{
        -"source": {
        "id": "the-hill",
                "name": "The Hill"
    },
        "author": "Max Greenwood",
            "title": "White House Correspondents' Association rebukes Trump over tweet on press credentials",
            "description": "The White House Correspondents' Association fired back at President Trump on Wednesday after he suggested revoking press credentials for journalists who cover his administration critically.",
            "url": "http://thehill.com/homenews/media/386922-white-house-correspondents-association-rebukes-trump-over-tweet-on-press",
            "urlToImage": "http://thehill.com/sites/default/files/trumpdonald_05042018getty.jpg",
            "publishedAt": "2018-05-09T16:53:20Z"
    },*/

    public String author;
    public NewsApiArticleSourceResponse source;
    public String title;
    public String description;
    public String url;
    public String urlToImage;
    public Date publishedAt;


}
