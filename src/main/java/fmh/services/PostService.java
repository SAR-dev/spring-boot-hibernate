package fmh.services;

import fmh.models.Post;
import fmh.repositories.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private PostRepository postRepository;

    public List<Post> getAllPosts() {
        return (List<Post>) postRepository.findAll();
    }

    public Optional<Post> getPostById(Integer id) {
        return postRepository.findById(id);
    }

    public List<Post> getPostsByAccountId(Integer id) {
        return postRepository.findByAccountId(id);
    }

    public void addPost(Post post) {
        postRepository.save(post);
    }
}
