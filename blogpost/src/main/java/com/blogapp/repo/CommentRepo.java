package com.blogapp.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blogapp.entities.Comment;
@Repository
public interface CommentRepo extends JpaRepository<Comment, Long>{
	List<Comment> findByBlogId(Long blogId);
	Optional<Comment> findByIdAndBlogId(Long id, Long postId);
}