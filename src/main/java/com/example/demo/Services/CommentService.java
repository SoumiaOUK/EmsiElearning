package com.example.demo.Services;

import com.example.demo.Entities.Comment;

import java.util.List;

public interface CommentService {
    Comment SaveComment(Comment comment);
    Comment GetCommentById(long id);
    Comment updateComment(Comment comment);
    void deleteCommentById(long id);
    void deleteAllComment();
    List<Comment> getAllComment();
}
