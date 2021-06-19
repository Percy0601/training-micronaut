package io.training.micronaut.adapter;

import io.micronaut.context.annotation.Factory;
import io.training.micronaut.api.TradeApi;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * 适配器配置，micronaut/spring factory<br>
 * <pre>
 *     1、micronaut/spring factory可以自定义Bean生成过程或者特殊配置等
 *     2、这个工厂类需要声明 @Factory
 *     3、生产micronaut/spring Bean时候，可以自定义进行编码
 * </pre>
 *
 */
@Factory
public class AdapterFactory {
    @Inject
    private TradeApi tradeApi;

    @Singleton
    public TradeApiAdapter tradeApiAdapterBean() {
        TradeApiAdapter tradeApiAdapter = new TradeApiAdapter("127.0.0.1:2181", tradeApi);
        return tradeApiAdapter;
    }
}
