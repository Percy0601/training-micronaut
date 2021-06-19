package io.training.micronaut.adapter;

import io.training.micronaut.api.CreateOrderRequest;
import io.training.micronaut.api.TradeApi;
import lombok.extern.slf4j.Slf4j;

/**
 * 远程TradeApi的适配模式
 * <pre>
 *     这个类初始化声明时候不定义 @Singleton ， 可以理解类似一个远程的Client/Stub等
 * </pre>
 *
 */
@Slf4j
public class TradeApiAdapter {
    /**
     * 远程zookeeper引用，获取服务器的ip:port
     */
    private String zkReference;
    /**
     * 远程实现引用，rpc框架中可能使用反射生成。
     */
    private TradeApi tradeApi;

    public TradeApiAdapter(String zkReference, TradeApi tradeApi) {
        this.zkReference = zkReference;
        this.tradeApi = tradeApi;
    }

    public String createOrder(CreateOrderRequest request) {
        String orderId = tradeApi.createOrder(request);
        log.info("TradeApiAdapter 下单，调用远程的ipAndPort:{}, request:{}, orderId:{}", zkReference, request, orderId);
        return orderId;
    }
}
