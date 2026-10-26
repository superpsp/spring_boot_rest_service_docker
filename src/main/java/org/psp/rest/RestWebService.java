package org.psp.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestWebService {
    public static final String PROTOCOL = "http";
    public static final String HOST = "springboot-rest-service";
    public static final int PORT = 8080;
    public static final String URI = PROTOCOL + "://" + HOST + ":" + PORT + "/";

    public static void main(String[] args) {
        SpringApplication.run(RestWebService.class, args);
    }
}