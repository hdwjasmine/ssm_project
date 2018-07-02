package com.he.dao;

import com.he.domain.User;

public interface UserDao {
    User selectUserById(Integer userId);
}
