package com.example.demo.Services;

import com.example.demo.Entities.User;

import java.util.List;

public interface UserService {
    User SaveUser(User User);
    User GetUserById(long id);
    User updateUser(User User);
    void deleteUserById(long id);
    void deleteAllUser();
    List<User> getAllUser();
}
