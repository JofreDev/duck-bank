package co.com.duck.usecase.customerservice;

import co.com.duck.model.customer.Customer;
import co.com.duck.model.customer.gateways.CustomerRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class CustomerServiceUseCase {

    private final CustomerRepository customerRepository;

    public Mono<Customer> findById(int id){

        return  customerRepository.findById(id)  ;
    }




}
