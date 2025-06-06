package com.lucasdev.offerqueryservice.controller;


import com.lucasdev.offerqueryservice.service.IngestClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/query")
public class QueryController {

    private final IngestClientService ingestClientService;


    public QueryController(IngestClientService ingestClientService) {
        this.ingestClientService = ingestClientService;
    }

    @GetMapping("/test-ingest")
    public Mono<String> testIngest() {
        return ingestClientService.getResponse();
    }

}

