package com.uu.chotlien.domain.tag;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("tags")
@Data
public class Tag {
    private String organizationId;

    private String name;
    private String description;
    private String colorHex;
}
