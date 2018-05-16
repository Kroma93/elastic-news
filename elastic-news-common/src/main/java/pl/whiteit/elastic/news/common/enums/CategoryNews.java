package pl.whiteit.elastic.news.common.enums;

public enum  CategoryNews {
    ENTERTAINMENT("Rozrywka"),
    GENERAL("Ogólne"),
    HEALTH("Zdrowie"),
    SCIENCE("Nauka"),
    SPORTS("Sporty"),
    TECHNOLOGY("Technologia");

    private String trans;

    CategoryNews(String trans){
        this.trans = trans;
    }

    public String getTrans() {
        return trans;
    }
}
