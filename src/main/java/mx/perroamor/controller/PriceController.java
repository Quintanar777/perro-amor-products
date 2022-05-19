package mx.perroamor.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import lombok.AllArgsConstructor;
import mx.perroamor.model.entity.Price;
import mx.perroamor.service.PriceService;

import java.util.List;

@AllArgsConstructor
@Controller("price")
public class PriceController {

    private final PriceService priceService;

    @Get
    public HttpResponse<List<Price>> getAllPrice() {
        return HttpResponse.ok(this.priceService.getAllPrice());
    }

    @Post
    public HttpResponse<Price> addPrice(Price price) {
        return HttpResponse.ok(this.priceService.addPrice(price));
    }
}
