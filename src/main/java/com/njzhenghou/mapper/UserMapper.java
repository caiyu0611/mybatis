package com.njzhenghou.mapper;


import com.njzhenghou.entity.Cat;
import com.njzhenghou.entity.User;

public interface UserMapper {

    User selectUserById(Integer id);

    void updateUser(User user);

}
