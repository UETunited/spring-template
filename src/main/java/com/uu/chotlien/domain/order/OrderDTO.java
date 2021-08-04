package com.uu.chotlien.domain.order;

import com.uu.chotlien.domain.product.Product;
import lombok.Data;

import java.util.List;

@Data
public class OrderDTO {
    private Double shippingFee;
    private Double discountValue;
    private List<OrderItemDTO> items;

    private String notes;
    private String customerId;
}

