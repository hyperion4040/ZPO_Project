package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class GreetingWebClient {
    private WebClient client = WebClient.create("http://localhost:8080");


    private Mono<ClientResponse> responseMono = client.get()
//            .uri("/universityName=1&foundingYear=1")
            .uri("/universityName")
            .accept(MediaType.TEXT_PLAIN)
            .exchange();

    public String getResult() {
        return "Wynik porównania struktur to: " + responseMono.flatMap(
                res -> res.bodyToMono(String.class)).block();
    }
}
