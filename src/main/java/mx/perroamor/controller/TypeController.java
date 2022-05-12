package mx.perroamor.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.AllArgsConstructor;
import mx.perroamor.model.entity.Type;
import mx.perroamor.service.TypeService;

import java.util.List;

@AllArgsConstructor
@Controller("/type")
public class TypeController {

    private final TypeService typeService;

    @Get
    public HttpResponse<List<Type>> getAllType() {
        return HttpResponse.ok(this.typeService.getAllType());
    }
}
