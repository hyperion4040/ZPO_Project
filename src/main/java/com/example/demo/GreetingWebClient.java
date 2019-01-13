package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

public class GreetingWebClient {
    private WebClient client = WebClient.create("http://localhost:8080");

    private Mono<ClientResponse> result = client.get()
            .uri("/hello")
            .accept(MediaType.TEXT_PLAIN)
            .exchange();

    private Mono<ClientResponse> responseMono = client.get()
            .uri("/schoolName=1")
            .accept(MediaType.TEXT_PLAIN)
            .exchange();

    public String getResult() {
//        return ">>result= " + result.flatMap(res -> res.bodyToMono(String.class)).block();
        return "Wynik porównania struktur to: " + responseMono.flatMap(
                res -> res.bodyToMono(String.class)).block();
    }
}
