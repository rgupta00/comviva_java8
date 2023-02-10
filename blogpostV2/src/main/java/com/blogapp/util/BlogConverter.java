package com.blogapp.util;

import com.blogapp.dto.BlogDto;
import com.blogapp.entities.Blog;

public class BlogConverter {
	
	//Blog -> blogDto
	
	public static BlogDto convertToBlogDto(Blog blog) {
		BlogDto blogDto=new BlogDto();
		blogDto.setId(blog.getId());
		blogDto.setAuthor(blog.getAuthor());
		blogDto.setTitle(blog.getTitle());
		return blogDto;
	}
	
	//BLogDto-> blog

}
