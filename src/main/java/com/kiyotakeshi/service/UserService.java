package com.kiyotakeshi.service;

import com.kiyotakeshi.model.User;

import java.util.List;

public interface UserService {

    boolean existUser(Long id);

    boolean saveUser(User user);

    List<User> fetchAllUser();

    User fetchUserById(Long id);

    boolean deleteUser(Long id);

    boolean updateUser(Long id, User user);
}
