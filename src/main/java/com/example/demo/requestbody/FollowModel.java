package com.example.demo.requestbody;

import java.util.List;

public class FollowModel {
    private String userId;
    private List<String> talentIds;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getTalentIds() {
        return talentIds;
    }

    public void setTalentIds(List<String> talentIds) {
        this.talentIds = talentIds;
    }
}
