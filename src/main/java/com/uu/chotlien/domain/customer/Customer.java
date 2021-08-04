package com.uu.chotlien.domain.customer;

import com.uu.chotlien.common.BaseDocument;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("customers")
@Data
public class Customer extends BaseDocument {
    private String organizationId;

    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String ward;
    private String district;
    private String province;
    private String country;
}
