package pl.whiteit.elastic.news.common.config;

public class ConfigurationImpl implements Configuration {


    @Override
    public String getNewsApiUrl() {
        return "https://newsapi.org/v2";
    }
}
