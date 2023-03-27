package com.example.demo.converter;

import com.example.demo.dto.UserDTO;
import com.example.demo.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {
    public UserDTO toDTO (User userEntity) {
        UserDTO userDTO = new UserDTO();
        userDTO.setName(userEntity.getName());
        userDTO.setTalentIds(userEntity.getTalentIds());
        userDTO.setId(userEntity.getId());
        System.out.println(userEntity.getId());
        return userDTO;
    }
}
