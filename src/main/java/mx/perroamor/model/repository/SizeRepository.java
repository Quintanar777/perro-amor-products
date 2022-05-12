package mx.perroamor.model.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import mx.perroamor.model.entity.Size;

@Repository
public abstract class SizeRepository implements CrudRepository<Size, Long> {
}
