package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.example.demo.Entities.Comment;
import com.example.demo.Repositories.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Comment SaveComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public Comment GetCommentById(long id) {
        return commentRepository.findById(id).orElse(null);
    }

    @Override
    public Comment updateComment(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public void deleteCommentById(long id) {
        commentRepository.deleteById(id);
    }

    @Override
    public void deleteAllComment() {
        commentRepository.deleteAll();
    }

    @Override
    public List<Comment> getAllComment() {
        return commentRepository.findAll();
    }
}