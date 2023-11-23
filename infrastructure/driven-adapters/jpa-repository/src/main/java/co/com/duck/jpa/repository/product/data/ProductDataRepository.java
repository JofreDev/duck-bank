package co.com.duck.jpa.repository.product.data;

import co.com.duck.model.product.Product;
import co.com.duck.model.product.gateways.ProductRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ProductDataRepository implements ProductRepository {
    @Override
    public Flux<Product> getByClient(long id) {
        return null;
    }

    @Override
    public Mono<Product> save(Product product) {
        return null;
    }

    @Override
    public Flux<Product> getAll() {
        return null;
    }
}
