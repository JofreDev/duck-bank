package co.com.duck.jpa.repository.customer.data;

import co.com.duck.model.customer.Customer;
import co.com.duck.model.customer.gateways.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class CustomerDataRepository implements CustomerRepository {

    private final CustomerDataDAO repository;
    @Override
    public Mono<Customer> findById(int id) {
        return Mono.fromSupplier(() -> repository.findById(id))
                .flatMap(optional -> Mono.justOrEmpty(optional.map(this::toEntity)));
    }

    @Override
    public Mono<Customer> findByIdentificationNumber(String number) {
        return null;
    }

    @Override
    public Mono<Customer> save(Customer customer) {
        return null;
    }

    @Override
    public Flux<Customer> getAll() {
        return null;
    }

    private Customer toEntity(CustomerEntity data) {
        return Customer.builder()
                .identificationNumber(data.getCustomerIdentificationNumber())
                .name(data.getName())
                .email(data.getEmail())
                .status(data.getStatus())
                .type(data.getCustomerType())
                .build();
    }

    private CustomerEntity toData(Customer entity) {
        return CustomerEntity.builder().build();
    }
}
