package com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "roles")
public class Role {
    @Id
    private String id;

    private ConstRole name;

    public Role() {

    }

    public Role(ConstRole name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ConstRole getName() {
        return name;
    }

    public void setName(ConstRole name) {
        this.name = name;
    }
}
