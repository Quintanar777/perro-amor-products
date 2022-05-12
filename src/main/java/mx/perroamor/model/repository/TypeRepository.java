package mx.perroamor.model.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import mx.perroamor.model.entity.Type;

@Repository
public abstract class TypeRepository implements CrudRepository<Type, Long> {
}
