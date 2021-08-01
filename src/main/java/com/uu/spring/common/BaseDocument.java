package com.uu.spring.common;

import com.aventrix.jnanoid.jnanoid.NanoIdUtils;
import lombok.Data;
import org.springframework.data.annotation.*;

import java.util.Date;

@Data
public abstract class BaseDocument {
    @Id
    private String id = NanoIdUtils.randomNanoId();

    private boolean isActive = true;

    @CreatedDate
    private Date createdAt;
    @LastModifiedDate
    private Date updatedAt;

    @CreatedBy
    private String createdBy;
    @LastModifiedBy
    private String updatedBy;
}
