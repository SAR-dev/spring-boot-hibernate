package fmh.repositories;

import fmh.models.Account;
import fmh.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {

    List<Post> findByAccountId(Integer id);

}
