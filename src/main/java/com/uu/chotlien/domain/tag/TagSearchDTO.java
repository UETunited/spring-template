package com.uu.chotlien.domain.tag;

import com.uu.chotlien.common.SearchDTO;
import lombok.Data;

import java.util.List;

@Data
public class TagSearchDTO extends SearchDTO {
    private String text;
    private List<TagType> types;
    private Boolean isActive;
    private Boolean isDeleted;
}
