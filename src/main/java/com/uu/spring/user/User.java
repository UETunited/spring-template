package com.uu.spring.user;

import com.uu.spring.common.BaseDocument;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("users")
@Data
@Builder
public class User extends BaseDocument {
    @Field("name")
    private String name;
    @Field("email")
    private String email;
    @Field("password")
    private String password;
}
