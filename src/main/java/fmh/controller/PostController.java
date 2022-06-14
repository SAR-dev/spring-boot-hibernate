package fmh.controller;

import fmh.models.Post;
import fmh.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("/post")
    public void addPost(@RequestBody Post post) {
        postService.addPost(post);
    }

    @GetMapping("/post/list")
    public List<Post> getAllPosts(){
        return postService.getAllPosts();
    }

    @GetMapping("/post/{id}")
    public Optional<Post> getPostById(@PathVariable Integer id) {
        return postService.getPostById(id);
    }

    @GetMapping("/post/account/{id}")
    public List<Post> getPostsByAccountId(@PathVariable Integer id) {
        return postService.getPostsByAccountId(id);
    }
}
