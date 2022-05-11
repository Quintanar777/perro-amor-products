package mx.perroamor.model.repository;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import mx.perroamor.model.entity.Product;

@Repository
public abstract class ProductRepository implements CrudRepository<Product, Long> {
}
