package pl.whiteit.elastic.news.common.action;

import org.apache.log4j.Logger;
import pl.whiteit.elastic.news.common.exception.ExceptionService;
import pl.whiteit.elastic.news.common.exception.ServerException;
import pl.whiteit.elastic.news.common.rest.Response;
import pl.whiteit.elastic.news.common.rest.ResponseType;

import javax.inject.Inject;

public abstract class BaseAction<T extends Object> {

    @Inject
    protected Logger logger;

    public abstract Response<T> execute() throws ServerException;

    protected Response<T> response;

    protected T entity;

    protected void createResponse(String message) {
        createResponse();
        response.message = message;
    }

    protected void createResponse() {
        response = new Response<>();
        response.type = ResponseType.SUCCESS;
    }
    
    protected void throwServerError() throws ServerException {
        ExceptionService.throwServerError();
    }
    protected void throwServerError(String message) throws ServerException {
        ExceptionService.throwServerError(message);
    }
}
