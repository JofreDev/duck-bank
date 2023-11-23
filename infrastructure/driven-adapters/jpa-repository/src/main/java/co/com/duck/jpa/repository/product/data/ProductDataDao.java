package co.com.duck.jpa.repository.product.data;
import co.com.duck.jpa.repository.customerproduct.data.CustomerProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProductDataDao extends CrudRepository<ProductEntity, Long>, QueryByExampleExecutor<ProductEntity> {

}