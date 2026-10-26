package org.psp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RootController {
    protected final String HELP_MESSAGE = "Usage "
            + "curl " + RestWebService.URI + "api";

    @GetMapping
    public RootResponse help() {
        return new RootResponse(HELP_MESSAGE);
    }
}
