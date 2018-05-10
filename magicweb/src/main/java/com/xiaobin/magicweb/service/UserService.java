package com.xiaobin.magicweb.service;

import com.xiaobin.magicweb.model.User;

import java.util.List;

public interface UserService {

    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}
