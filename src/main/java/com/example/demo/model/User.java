package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("user")
public class User {
    @Id
    private String id;
    private String name;
    private List<String> talentIds;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTalentIds() {
        return talentIds;
    }

    public void setTalentIds(List<String> talentIds) {
        this.talentIds = talentIds;
    }
}
