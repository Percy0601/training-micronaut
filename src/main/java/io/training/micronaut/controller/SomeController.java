package io.training.micronaut.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.training.micronaut.entity.Item;
import io.training.micronaut.service.BizService;

import javax.inject.Inject;

@Controller("/training")
public class SomeController {

    @Inject
    BizService bizService;

    @Get("/getBySku")
    public Item getBySku(Long sku) {
        return bizService.getBySku(sku);
    }

}
