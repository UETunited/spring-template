package com.uu.chotlien.domain.catalog;

import com.uu.chotlien.common.SearchDTO;
import lombok.Data;

@Data
public class CatalogSearchDTO extends SearchDTO {
    private String text;
    private Boolean isActive;
    private Boolean isDeleted;
}
