package com.uu.chotlien.domain.catalog;

import com.uu.chotlien.common.BaseDocument;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("catalogs")
public class Catalog extends BaseDocument {
    private String organizationId;

    private String name;
    private String description;
    private String image;
}
