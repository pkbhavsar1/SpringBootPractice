package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

//    Fake User List
    List<User> list = List.of(
        new User(101L, "Pradyumn Bhavsar", "8421819557"),
        new User(102L,"Abhijeet Patil","7083070890"),
        new User(103L,"Pankaj Pawar","9665777442")
);

    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
