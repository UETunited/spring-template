package com.uu.chotlien.common;

import lombok.Data;

@Data
public abstract class SearchDTO {
    private Integer skip = 0;
    private Integer limit = 25;
}
