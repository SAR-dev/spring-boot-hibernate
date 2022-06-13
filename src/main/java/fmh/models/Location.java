package fmh.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Location {

    @Id
    private Integer id;
    private String name;

    @OneToMany
    private List<User> users;
}
