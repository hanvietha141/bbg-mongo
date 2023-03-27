package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.model.User;
import com.example.demo.requestbody.FollowModel;

import java.util.List;

public interface IUserService {
    User createUser(User user);
    List<UserDTO> getUsers();
    Object getUserById(String id);
    Object updateFollowing(FollowModel model);
}
