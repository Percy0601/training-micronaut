package io.training.micronaut.api.remote;

import io.training.micronaut.api.CreateOrderRequest;
import io.training.micronaut.api.TradeApi;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Singleton;
import java.util.UUID;

/**
 * 远程实现类
 */
@Slf4j
@Singleton
public class TradeApiImpl implements TradeApi {
    @Override
    public String createOrder(CreateOrderRequest request) {
        String orderId = UUID.randomUUID().toString();
        log.info("客户下单: request:{}, orderId:{}", orderId);
        return orderId;
    }
}
