package mx.perroamor.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.AllArgsConstructor;
import mx.perroamor.model.entity.Size;
import mx.perroamor.service.SizeService;

import java.util.List;

@AllArgsConstructor
@Controller("/size")
public class SizeController {

    private final SizeService sizeService;

    @Get
    public HttpResponse<List<Size>> getAllSize() {
        return HttpResponse.ok(this.sizeService.getAllSize());
    }
}
