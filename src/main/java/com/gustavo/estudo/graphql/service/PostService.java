package com.gustavo.estudo.graphql.service;

import com.gustavo.estudo.graphql.data.Post;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class PostService {

    Map<String, Post> posts = new HashMap<>();

    public Collection<Post> createPost(String content) {
        Post newPost = new Post(UUID.randomUUID().toString(), content);
        posts.put(newPost.getId(), newPost);
        return posts.values();
    }

    public Post postById(String id){
        return posts.get(id);
    }
}
