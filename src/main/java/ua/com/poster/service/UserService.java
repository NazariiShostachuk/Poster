package ua.com.poster.service;

import ua.com.poster.entity.User;

import java.util.List;

/**
 * Created by MackGeeker on 10.06.2017.
 */
public interface UserService {

    void save(User user);

    User findOne(int id);

    void delete(int id);

    List<User> findAll();


    User findUserByUsername(String username);

    User findUserById(int id);
}
