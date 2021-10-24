package com.zhoujin.service;

import com.zhoujin.entity.User;

public interface UserService {
    void register(User user);

    User login(String username, String password);
}
