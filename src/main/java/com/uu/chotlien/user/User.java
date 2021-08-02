package com.uu.chotlien.user;

import com.uu.chotlien.common.BaseDocument;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("users")
@Data
@Builder
public class User extends BaseDocument {
    @Field("name")
    private String name;
    @Field("email")
    @Indexed(unique = true)
    private String email;
    @Field("password")
    private String password;

    private String organizationId;

    public String getName() {
        return this.name != null ? this.name : this.email;
    }
}
