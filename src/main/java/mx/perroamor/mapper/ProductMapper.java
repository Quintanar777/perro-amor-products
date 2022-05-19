package mx.perroamor.mapper;

import mx.perroamor.dto.ProductDTO;
import mx.perroamor.model.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    Product productDTOToProduct(ProductDTO productDTO);
}
