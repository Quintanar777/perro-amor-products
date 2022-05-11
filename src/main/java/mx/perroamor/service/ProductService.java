package mx.perroamor.service;

import jakarta.inject.Singleton;
import lombok.AllArgsConstructor;
import mx.perroamor.model.entity.Product;
import mx.perroamor.model.repository.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@AllArgsConstructor
@Singleton
public class ProductService {

    private final ProductRepository productRepository;

    /**
     * Get all products
     */
    public List<Product> getAllProducts() {
        return StreamSupport.stream(this.productRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
}
