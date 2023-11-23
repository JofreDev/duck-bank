package co.com.duck.model.customer.gateways;

import co.com.duck.model.customer.Customer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

public interface CustomerRepository {

    Mono<Customer> findById(int id);

    Mono<Customer> findByIdentificationNumber(String number);

    Mono<Customer> save(Customer customer);

    Flux<Customer> getAll();

}
