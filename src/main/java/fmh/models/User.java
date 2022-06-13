package fmh.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    private Integer id;
    private String first_name;
    private String last_name;
    private String email;

    @ManyToOne
    private Location location;

    @OneToMany
    private List<Post> posts;

}
