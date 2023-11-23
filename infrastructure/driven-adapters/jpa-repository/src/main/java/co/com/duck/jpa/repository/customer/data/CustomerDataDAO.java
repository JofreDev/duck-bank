package co.com.duck.jpa.repository.customer.data;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CustomerDataDAO extends CrudRepository<CustomerEntity, Integer>, QueryByExampleExecutor<CustomerEntity> {

}
