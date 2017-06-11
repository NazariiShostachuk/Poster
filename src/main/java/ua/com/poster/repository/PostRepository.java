package ua.com.poster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.poster.entity.Post;

/**
 * Created by MackGeeker on 11.06.2017.
 */
public interface PostRepository  extends JpaRepository <Post, Integer>{

}
