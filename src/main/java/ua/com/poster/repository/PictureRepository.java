package ua.com.poster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.poster.entity.Picture;

/**
 * Created by MackGeeker on 11.06.2017.
 */
public interface PictureRepository  extends JpaRepository<Picture, Integer>{

}
