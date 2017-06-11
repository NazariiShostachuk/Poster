package ua.com.poster.entity;

import javax.persistence.*;

/**
 * Created by MackGeeker on 10.06.2017.
 */
@Entity
public class Picture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String pathToImage;


    @ManyToOne
    private Post post;

    @ManyToOne
    private User user;

    public Picture() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPathToImage() {
        return pathToImage;
    }

    public void setPathToImage(String pathToImage) {
        this.pathToImage = pathToImage;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "id=" + id +
                ", pathToImage='" + pathToImage + '\'' +
                '}';
    }

}