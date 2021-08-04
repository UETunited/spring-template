package com.uu.chotlien.notification;

import com.uu.chotlien.common.BaseDocument;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("notifications")
@Data
public class Notification extends BaseDocument {
    private String organizationId;
}
