package mx.perroamor.model.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import mx.perroamor.model.entity.Price;

@Repository
public abstract class PriceRepository implements CrudRepository<Price, Long> {
}
