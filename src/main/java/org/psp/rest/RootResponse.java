package org.psp.rest;

public class RootResponse extends AbstractResponse {
    public RootResponse(String responseMessage) {
        this.requestId = "N/A";
        this.responseCode = "0";
        this.responseMessage = responseMessage;
    }
}
