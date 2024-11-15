package com.example.deployment_test.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
@Data
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
}
