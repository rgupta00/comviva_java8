package com.blogapp.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogapp.entities.Blog;
import com.blogapp.exceptions.ResouceNotFoundException;
import com.blogapp.repo.BlogRepo;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "api")
@AllArgsConstructor
public class BlogApi {
	final private BlogRepo blogRepo;

	// get all blogs
	@GetMapping(path = "blogs")
	public ResponseEntity<List<Blog>> getAll() {
		
		return ResponseEntity.status(HttpStatus.OK).body(blogRepo.findAll());
	}

	// get all blogs by id
	@GetMapping(path = "blogs/{id}")
	public ResponseEntity<Blog> getAnBlogById(@PathVariable long id) {
		return blogRepo.findById(id).map(blog -> {
			return ResponseEntity.status(HttpStatus.OK).body(blog);
		}).orElseThrow(() -> new ResouceNotFoundException("blog with id " + id + " is not found"));

	}

	// update
	@PutMapping(path = "blogs/{id}")
	public ResponseEntity<Blog> updateAnBlogById(@PathVariable long id, @RequestBody Blog blogReq) {
		return blogRepo.findById(id).map(blog -> {
			blog.setContent(blogReq.getContent());
			blogRepo.save(blog);
			return ResponseEntity.status(HttpStatus.OK).body(blog);
		}).orElseThrow(() -> new ResouceNotFoundException("blog with id " + id + " is not found"));

	}

	// delete
	@DeleteMapping(path = "blogs/{id}")
	public ResponseEntity<?> deleteAnBlogById(@PathVariable long id, @RequestBody Blog blogReq) {
		return blogRepo.findById(id).map(blog -> {
			blogRepo.delete(blog);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		}).orElseThrow(() -> new ResouceNotFoundException("blog with id " + id + " is not found"));

	}

	// add new blog
	@PostMapping(path = "blogs")
	public ResponseEntity<Blog> postAnBlogById(@RequestBody  @Valid Blog blogReq) {
		blogRepo.save(blogReq);
		return ResponseEntity.status(HttpStatus.CREATED).body(blogReq);
	}

}
