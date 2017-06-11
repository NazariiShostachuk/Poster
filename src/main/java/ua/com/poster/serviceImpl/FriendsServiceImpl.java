package ua.com.poster.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.poster.entity.Friends;
import ua.com.poster.repository.FriendsRepository;
import ua.com.poster.service.FriendsService;

import java.util.List;

/**
 * Created by MackGeeker on 11.06.2017.
 */
@Service
public class FriendsServiceImpl implements FriendsService {

    @Autowired
    private FriendsRepository friendsRepository;

    @Override
    public Friends findOne(int id) {
        return friendsRepository.findOne(id);
    }

    @Override
    public List<Friends> findAll() {
        return friendsRepository.findAll() ;
    }

    @Override
    public void save(Friends friends) {
        friendsRepository.save(friends);
    }

    @Override
    public void delete(int id) {
        friendsRepository.delete(id);
    }
}
