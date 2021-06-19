package io.training.micronaut.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.training.micronaut.adapter.TradeApiAdapter;
import io.training.micronaut.api.CreateOrderRequest;
import io.training.micronaut.entity.Item;
import io.training.micronaut.service.BizService;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller("/training")
public class SomeController {

    @Inject
    BizService bizService;
    @Inject
    TradeApiAdapter tradeApiAdapter;

    @Get("/getBySku")
    public Item getBySku(Long sku) {
        return bizService.getBySku(sku);
    }

    @Get("/createOrderWithGet")
    @Post("/createOrder")
    public String createOrder(Long userId) {
        CreateOrderRequest request = new CreateOrderRequest();
        request.setUserId(userId);
        Random rd = new Random();
        request.setCampaignId((long)rd.nextInt(1000));
        List<Long> itemIds = new ArrayList<>();
        itemIds.add((long)rd.nextInt(100000));
        itemIds.add((long)rd.nextInt(100000));
        itemIds.add((long)rd.nextInt(100000));
        request.setItemIds(itemIds);

        return tradeApiAdapter.createOrder(request);
    }
}
