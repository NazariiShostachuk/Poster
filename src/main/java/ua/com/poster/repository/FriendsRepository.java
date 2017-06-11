package ua.com.poster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.poster.entity.Friends;

/**
 * Created by MackGeeker on 11.06.2017.
 */
public interface FriendsRepository extends JpaRepository<Friends, Integer> {

}
