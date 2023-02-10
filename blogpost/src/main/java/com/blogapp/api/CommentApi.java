package com.blogapp.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogapp.entities.Blog;
import com.blogapp.repo.BlogRepo;

import lombok.AllArgsConstructor;

//@RestController
//@RequestMapping(path = "api")
//@AllArgsConstructor
//public class CommentApi {
//	
//	final private BlogRepo blogRepo;
//	final private CommentApi commentApi;
//	
//
//	@GetMapping(path = "blogs/{id}/comments")
//	public ResponseEntity<List<Blog>> getAll() {
//		return null;
//		//return ResponseEntity.status(HttpStatus.OK).body(blogRepo.findAll());
//	}
//	
//}
