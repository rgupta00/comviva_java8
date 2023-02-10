package com.blogapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.blogapp.entities.Blog;
import com.blogapp.entities.Comment;
import com.blogapp.repo.BlogRepo;
import com.blogapp.repo.CommentRepo;

@SpringBootApplication
public class BlogpostApplication implements CommandLineRunner {

	@Autowired
	private BlogRepo blogRepo;
	
	@Autowired
	private CommentRepo commentRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(BlogpostApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// blogRepo.delete(blogRepo.getOne(1L));

		Blog blog = new Blog("spring5", "amit", "spring 5 is lastest form spring.io");
		Blog blog2 = new Blog("java8", "raj", "java 8 is morden java");

		Comment comment1 = new Comment(blog, "good blog on spring 5");
		Comment comment2 = new Comment(blog, "spring 5 rock");
		Comment comment3 = new Comment(blog, "i need basic into to spring first");

		Comment comment4 = new Comment(blog2, "good blog on spring 8");
		Comment comment5 = new Comment(blog2, "need more details");
		Comment comment6 = new Comment(blog2, "i need basic of collection");

		blogRepo.save(blog);
		commentRepo.save(comment1);
		commentRepo.save(comment2);
		commentRepo.save(comment3);

		blogRepo.save(blog2);
		commentRepo.save(comment4);
		commentRepo.save(comment5);
		commentRepo.save(comment6);

	}

}
