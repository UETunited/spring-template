package com.uu.chotlien.user;

import com.uu.chotlien.common.BaseDocument;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("users")
@Data
@Builder
public class User extends BaseDocument {
    private String fullName;
    @Indexed(unique = true)
    private String username;
    private String password;
    @Indexed(unique = true)
    private String email;

    private String organizationId;

    public String getName() {
        return this.fullName != null ? this.fullName : this.username;
    }
}
