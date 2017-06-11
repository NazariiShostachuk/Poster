package ua.com.poster.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MackGeeker on 10.06.2017.
 */
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String namePost;
    private String descriptionPost;
    private int likes;

    @OneToMany(mappedBy = "post")
    private List<Picture> picturesPost = new ArrayList<Picture>();

    @ManyToOne
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamePost() {
        return namePost;
    }

    public void setNamePost(String namePost) {
        this.namePost = namePost;
    }

    public String getDescriptionPost() {
        return descriptionPost;
    }

    public void setDescriptionPost(String descriptionPost) {
        this.descriptionPost = descriptionPost;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<Picture> getPicturesPost() {
        return picturesPost;
    }

    public void setPicturesPost(List<Picture> picturesPost) {
        this.picturesPost = picturesPost;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", namePost='" + namePost + '\'' +
                ", descriptionPost='" + descriptionPost + '\'' +
                ", likes=" + likes +
                ", picturesPost=" + picturesPost +
                ", user=" + user +
                '}';
    }
}