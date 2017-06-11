package ua.com.poster.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MackGeeker on 10.06.2017.
 */
@Entity
public class Friends {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "friends")
    private List<User> userFriends= new ArrayList<User>();

    public Friends(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<User> getUserFriends() {
        return userFriends;
    }

    public void setUserFriends(List<User> userFriends) {
        this.userFriends = userFriends;
    }

    @Override
    public String toString() {
        return "Friends{" +
                "userFriends=" + userFriends +
                '}';
    }
}
