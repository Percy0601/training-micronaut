package io.training.micronaut.api;

/**
 * 交易模块
 */
public interface TradeApi {

    /**
     * 下单
     * @param request
     * @return
     */
    String createOrder(CreateOrderRequest request);

}
