package mx.perroamor.dto;

import io.micronaut.core.annotation.Introspected;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Introspected
public class ProductDTO {

    @NotBlank
    private String name;

    @NotBlank
    private String description;

    @NotNull
    private Long idSize;

    @NotNull
    private Long idType;

    private Long idSubType;

    @NotNull
    private Long idPrice;
}
