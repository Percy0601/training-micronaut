package io.training.micronaut.api;

import lombok.Data;

import java.util.List;

@Data
public class CreateOrderRequest {
    private Long userId;
    private List<Long> itemIds;
    private Long campaignId;
}
