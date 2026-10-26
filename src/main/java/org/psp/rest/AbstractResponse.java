package org.psp.rest;

public class AbstractResponse {
    protected String requestId;
    protected String responseCode;
    protected String responseMessage;

    public String getRequestId() {
        return requestId;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }
}
