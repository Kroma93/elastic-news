package pl.whiteit.elastic.news.common.rest;

import java.util.List;

public class Response<T> {

    public Response() {
    }

    public Response(ResponseType type, String message) {
        super();
        this.type = type;
        this.message = message;
    }

    public String message;

    public ResponseType type;

    public T entity;
    public List<T> data;

}