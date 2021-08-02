package com.uu.chotlien.domain.product;

import com.uu.chotlien.common.SearchDTO;
import lombok.Data;

import java.util.List;

@Data
public class ProductSearchDTO extends SearchDTO {
    private String text;
    private Boolean isActive;
    private Boolean isDeleted;
    private List<String> catalogIds;
    private List<String> tagIds;
}
