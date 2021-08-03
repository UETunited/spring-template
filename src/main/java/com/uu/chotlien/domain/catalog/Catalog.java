package com.uu.chotlien.domain.catalog;

import com.uu.chotlien.common.BaseDocument;
import lombok.Data;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("catalogs")
@Data
public class Catalog extends BaseDocument {
    private String organizationId;

    @TextIndexed
    private String name;
    private String description;
    private String image;
}
