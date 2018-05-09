package pl.whiteit.elastic.news.common.exception;

import javax.ws.rs.core.Response.Status;

public class ServerException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 6375241436756689972L;

    
    public Status status;
    
    public ServerException(Status status, String message) {
        super(message);
        this.status = status;
    }
    
    public Status getStatus() {
        return status;
    }
}
