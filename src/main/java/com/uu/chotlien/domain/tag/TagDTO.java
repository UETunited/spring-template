package com.uu.chotlien.domain.tag;

import lombok.Data;

@Data
public class TagDTO {
    private String name;
    private TagType type;
    private String description;
    private String colorHex;
}
