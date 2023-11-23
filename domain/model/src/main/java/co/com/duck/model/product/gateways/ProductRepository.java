package co.com.duck.model.product.gateways;

import co.com.duck.model.customer.Customer;
import co.com.duck.model.product.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductRepository {

    Flux<Product> getByClient(long id);

    Mono<Product> save(Product product);

    Flux<Product> getAll();
}
