package com.infy.sample.gcp.entity.firestore;

import com.google.cloud.firestore.annotation.DocumentId;
import lombok.Data;
import org.springframework.cloud.gcp.data.firestore.Document;

@Data
@Document(collectionName = "users")
public class User implements FirestoreEntity {

    @DocumentId
    private String id;
    private String username;

}
