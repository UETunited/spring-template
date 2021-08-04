package com.uu.chotlien.domain.order;

import com.uu.chotlien.domain.product.Product;
import lombok.Data;

@Data
public class OrderItem {
    private String productId;
    private Product product;
    private Integer quantity;
    private Double unitPrice;
}
