package pl.whiteit.elastic.news.common.rest;

public enum ResponseType {

    SUCCESS("Response ok"),
    ERROR("There was an error while retrieving data"),
    WARNING(""),
    INFO(""),
    UNKNOWN("");

    ResponseType(String message){
        setMessage(message);
    }

    private String message;

    public String getMessage() {
        return message;
    }

    private void setMessage(String message) {
        this.message = message;
    }
}
