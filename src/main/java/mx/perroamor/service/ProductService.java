package mx.perroamor.service;

import jakarta.inject.Singleton;
import lombok.AllArgsConstructor;
import mx.perroamor.controller.util.GenerateCodeUtil;
import mx.perroamor.dto.ProductDTO;
import mx.perroamor.mapper.ProductMapper;
import mx.perroamor.model.entity.Product;
import mx.perroamor.model.repository.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@AllArgsConstructor
@Singleton
public class ProductService {

    private final ProductRepository productRepository;
    private final GenerateCodeUtil generateCodeUtil;
    private final SizeRepository sizeRepository;
    private final TypeRepository typeRepository;
    private final SubTypeRepository subTypeRepository;
    private final PriceRepository priceRepository;

    /**
     * Get all products
     */
    public List<Product> getAllProducts() {
        return StreamSupport.stream(this.productRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    /**
     * Add product
     */
    public Product addProduct(final ProductDTO productDTO) {
        Product product = ProductMapper.INSTANCE.productDTOToProduct(productDTO);
        product.setCode(this.generateCodeUtil.getUniqueProductCode());
        this.sizeRepository.findById(productDTO.getIdSize()).ifPresent(product::setSize);
        this.typeRepository.findById(productDTO.getIdType()).ifPresent(product::setType);
        this.subTypeRepository.findById(productDTO.getIdSubType()).ifPresent(product::setSubType);
        this.priceRepository.findById(productDTO.getIdPrice()).ifPresent(product::setPrice);
        return this.productRepository.save(product);
    }
}
