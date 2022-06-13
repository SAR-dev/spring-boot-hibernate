package fmh.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Post {

    @Id
    private Integer id;
    private LocalDate created_at;

    @ManyToOne
    private User author;
    private String title;
    private String desc;

}
