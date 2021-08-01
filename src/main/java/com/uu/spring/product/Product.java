package com.uu.spring.product;

import com.uu.spring.common.BaseDocument;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document("products")
public class Product extends BaseDocument {
    private String name;
    private String code;
    private String description;
    private String sku;
    private List<String> catalogIds;
    private List<String> images;
    private Double unitPrice;
    private Integer numberInStock = 0;
}
