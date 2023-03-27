package com.example.demo.api;

import com.example.demo.dto.UserDTO;
import com.example.demo.model.User;
import com.example.demo.requestbody.FollowModel;
import com.example.demo.service.iplm.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UserApi {
    @Autowired
    private UserService userService;
    @PostMapping(value="/user")
    public User createUSer(@RequestBody User model) {
        return userService.createUser(model);
    }
    @GetMapping(value="/user")
    public List<UserDTO> getUsers() {
        return userService.getUsers();
    }
    @GetMapping(value="/user/{id}")
    public Object getUserById (@PathVariable String id) {
        return userService.getUserById(id);
    }

    @PostMapping(value="/follow")
    public Object userUpdateFollowing(@RequestBody FollowModel model) {
        return userService.updateFollowing( model);
    }
}
