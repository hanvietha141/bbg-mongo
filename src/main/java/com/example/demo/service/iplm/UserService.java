package com.example.demo.service.iplm;

import com.example.demo.converter.UserConverter;
import com.example.demo.dto.UserDTO;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.requestbody.FollowModel;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    UserConverter userConverter;
    @Override
    public User createUser (User user) {
        userConverter.toDTO(user);
        User Entity = userRepository.save(user);
        return Entity;
    }
    @Override
    public List<UserDTO> getUsers() {
//        Page<User> users = userRepository.findAll(PageRequest.of(1, 1));
        List<User> users =userRepository.findAll();
        List<User> users1 = users.stream().skip(3).limit(1).toList();
        ArrayList<UserDTO> userDTO = new ArrayList<UserDTO>();
        for (User user: users1) {
            userDTO.add(userConverter.toDTO(user));
        }
        return userDTO;
    }

    @Override
    public Object getUserById(String id) {
        User userEntity = userRepository.findById(id).orElse(null);
        if (userEntity != null) {
            return userEntity;
        }
        return "Not found";
    }

    @Override
    public Object updateFollowing(FollowModel model) {
        System.out.println(model.getUserId());
        User userEntity = userRepository.findById(model.getUserId()).orElse(null);
        ArrayList<String> talentsFollowing = (ArrayList<String>) userEntity.getTalentIds();
        if(userEntity != null) {
            for (String talentId : model.getTalentIds()) {
                if(talentsFollowing.contains(talentId)) {
                    return "Cannot follow";
                }
            }
            talentsFollowing.addAll(model.getTalentIds());
            userEntity.setTalentIds(talentsFollowing);
            userEntity = userRepository.save(userEntity);
            return userConverter.toDTO(userEntity);
        }
        return "Not found";
    }
}
