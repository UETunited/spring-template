package com.uu.spring.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommonResponse<T> {
    private String errorCode;
    private String message;
    private T data;
}
