package com.gustavo.estudo.graphql.service;

import com.gustavo.estudo.graphql.data.Comment;
import com.gustavo.estudo.graphql.data.Post;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class CommentService {

    Map<String, Comment> comments = new HashMap<>();

    public Collection<Comment> createComment(String content, String postId) {
        var newComment = new Comment(UUID.randomUUID().toString(), content, postId);
        comments.put(newComment.getId(), newComment);
        return comments.values();
    }

    public Collection<Comment> findByPost(String postId) {
        return comments.values().stream()
                .filter(comment -> comment.getPostId().equals(postId))
                .collect(Collectors.toList());
    }
}
