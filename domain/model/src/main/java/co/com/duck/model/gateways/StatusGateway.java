package co.com.duck.model.gateways;

import reactor.core.publisher.Mono;

public interface StatusGateway {

    Mono<String> send(String message);
}
