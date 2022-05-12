package mx.perroamor.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.AllArgsConstructor;
import mx.perroamor.model.entity.SubType;
import mx.perroamor.service.SubTypeService;

import java.util.List;

@AllArgsConstructor
@Controller("/sub-type")
public class SubTypeController {

    private final SubTypeService typeService;

    @Get
    public HttpResponse<List<SubType>> getAllSubType() {
        return HttpResponse.ok(this.typeService.getAllSubType());
    }
}
