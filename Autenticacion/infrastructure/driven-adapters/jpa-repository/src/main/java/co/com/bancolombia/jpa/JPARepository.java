package co.com.bancolombia.jpa;

import co.com.bancolombia.jpa.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface JPARepository extends CrudRepository<User/* change for adapter model */, String>,
        QueryByExampleExecutor<User/* change for adapter model */> {
}
