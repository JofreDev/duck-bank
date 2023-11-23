package co.com.duck.api;

import co.com.duck.model.customer.Customer;
import co.com.duck.model.gateways.StatusGateway;
import co.com.duck.usecase.customerservice.CustomerServiceUseCase;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class Handler {

    private final CustomerServiceUseCase customerServiceUseCase;

    public Mono<ServerResponse> listenGETUseCase(ServerRequest serverRequest) {

        return (customerServiceUseCase.findById(1)).flatMap(account -> ServerResponse.ok().bodyValue(account));
    }

    public Mono<ServerResponse> listenGETOtherUseCase(ServerRequest serverRequest) {
        // useCase2.logic();

        return ServerResponse.ok().bodyValue("");
    }

    public Mono<ServerResponse> listenPOSTUseCase(ServerRequest serverRequest) {
        // usecase.logic();
        return ServerResponse.ok().bodyValue("");
    }
}
