package co.com.duck.jpa.repository.customerproduct.data;
import co.com.duck.jpa.repository.customer.data.CustomerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;


public interface CustomerProductDataDao extends CrudRepository<CustomerProductEntity, Long>,
        QueryByExampleExecutor<CustomerProductEntity> { }
