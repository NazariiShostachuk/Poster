package ua.com.poster.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ua.com.poster.entity.User;
import ua.com.poster.repository.UserRepository;
import ua.com.poster.service.UserService;

import java.util.List;

/**
 * Created by MackGeeker on 10.06.2017.
 */
@Service("userDetailsService")
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findUserByUsername(username);
    }

    @Override
    public void save(User user) {
        user.setRole(ua.com.poster.entity.Role.ROLE_USER);
        user.setPassword(encoder.encode(user.getPassword()));
        userRepository.save(user);
    }

    @Override
    public User findOne(int id) {
        return userRepository.findOne(id);
    }

    @Override
    public void delete(int id) {
        userRepository.delete(id);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }








    @Override
    public User findUserById(int id) {
        return userRepository.findUsersById(id);
    }

    @Override
    public User findUserByUsername(String  username) {
        return userRepository.findUserByUsername(username);
    }



}