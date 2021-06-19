package io.training.micronaut.service;

import io.training.micronaut.entity.Item;
import io.training.micronaut.mapper.ItemRepository;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;
import javax.inject.Singleton;

@Slf4j
@Singleton
public class BizService {

    @Inject
    ItemRepository itemRepository;

    public Item getBySku(Long sku) {
        Item item = itemRepository.find(sku);
        log.info("根据sku查询商品, sku:{}, result:{}", sku, item);
        return item;
    }


}
