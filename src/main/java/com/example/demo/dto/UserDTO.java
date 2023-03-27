package com.example.demo.dto;

import java.util.List;

public class UserDTO {
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
