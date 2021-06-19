package io.training.micronaut.entity;

import lombok.Data;

@Data
public class Item {
    private Long id;
    private String name;
    private Long sku;
}
