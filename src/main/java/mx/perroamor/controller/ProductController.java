package mx.perroamor.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import lombok.AllArgsConstructor;
import mx.perroamor.dto.ProductDTO;
import mx.perroamor.model.entity.Product;
import mx.perroamor.service.ProductService;

import java.util.List;

@AllArgsConstructor
@Controller("/product")
public class ProductController {

    private final ProductService productService;

    @Get
    public HttpResponse<List<Product>> getAllProducts() {
        return HttpResponse.ok(this.productService.getAllProducts());
    }

    @Post
    public HttpResponse<Product> addProduct(final ProductDTO productDTO) {
        return HttpResponse.created(this.productService.addProduct(productDTO));
    }
}
