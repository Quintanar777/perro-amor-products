package mx.perroamor.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.validation.Validated;
import lombok.AllArgsConstructor;
import mx.perroamor.dto.ProductDTO;
import mx.perroamor.model.entity.Product;
import mx.perroamor.service.ProductService;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@Controller("/product")
@Validated
public class ProductController {

    private final ProductService productService;

    @Get
    public HttpResponse<List<Product>> getAllProducts() {
        return HttpResponse.ok(this.productService.getAllProducts());
    }

    @Post
    public HttpResponse<Product> addProduct(@Body @Valid final ProductDTO productDTO) {
        return HttpResponse.created(this.productService.addProduct(productDTO));
    }
}
