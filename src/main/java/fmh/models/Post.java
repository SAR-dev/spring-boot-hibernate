package fmh.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Post {

    public Post() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDate created_at) {
        this.created_at = created_at;
    }

    @JsonBackReference
    public Account getAuthor() {
        return author;
    }

    public void setAuthor(Account author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Id
    private Integer id;
    private LocalDate created_at;

    public Post(Integer id, LocalDate created_at, Account author, String title, String desc, Account account) {
        this.id = id;
        this.created_at = created_at;
        this.author = author;
        this.title = title;
        this.desc = desc;
        this.account = account;
    }

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Account author;
    private String title;
    private String desc;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
}
