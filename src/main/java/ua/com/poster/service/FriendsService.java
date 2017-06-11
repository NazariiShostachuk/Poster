package ua.com.poster.service;

import ua.com.poster.entity.Friends;

import java.util.List;

/**
 * Created by MackGeeker on 11.06.2017.
 */
public interface FriendsService {

    Friends findOne(int id);

    List<Friends> findAll();

    void save(Friends friends);

    void delete(int id);

}
