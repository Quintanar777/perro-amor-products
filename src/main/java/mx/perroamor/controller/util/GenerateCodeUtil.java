package mx.perroamor.controller.util;

import jakarta.inject.Singleton;
import lombok.AllArgsConstructor;
import mx.perroamor.model.entity.Product;
import mx.perroamor.model.repository.ProductRepository;
import org.apache.commons.math3.random.RandomDataGenerator;

import java.util.Optional;

@AllArgsConstructor
@Singleton
public class GenerateCodeUtil {

    private final ProductRepository productRepository;

    public String getUniqueProductCode() {
        RandomDataGenerator randomDataGenerator = new RandomDataGenerator();
        int randomWithRandomDataGenerator = randomDataGenerator.nextInt(1000, 9999);
        Optional<Product> existCode = this.productRepository.findByCode(String.valueOf(randomWithRandomDataGenerator));
        if (existCode.isPresent()) {
            return getUniqueProductCode();
        } else {
            return String.valueOf(randomWithRandomDataGenerator);
        }
    }
}
