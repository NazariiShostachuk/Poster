package ua.com.poster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ua.com.poster.entity.User;

/**
 * Created by MackGeeker on 10.06.2017.
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    User findUserByUsername(String username);

    @Query(value = "select u from User u  where u.id =:id")
    User findUsersById(@Param("id") int id);

}
