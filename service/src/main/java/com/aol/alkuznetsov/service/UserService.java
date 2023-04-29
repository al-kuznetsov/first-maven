package com.aol.alkuznetsov.service;

import com.aol.alkuznetsov.database.dao.UserDao;
import com.aol.alkuznetsov.dto.UserDto;
import java.util.Optional;

public class UserService {

    private final UserDao userDao = new UserDao();

    public Optional<UserDto> getUser(Long id) {
        return userDao.findById(id)
                .map(it -> new UserDto());
    }
}
