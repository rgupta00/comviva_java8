package com.blogapp.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import com.blogapp.entities.Comment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BlogDto {
	
	private Long id;
	
	@NotNull(message = "{blog.title.absent}")
	private String title;
	
	@NotNull(message = "{blog.author.absent}")
	private String author;
	
	@NotNull(message = "{blog.content.absent}")
	private String content;

	
	@Override
	public String toString() {
		return "Blog [id=" + id + ", title=" + title + ", author=" + author + ", content=" + content + "]";
	}
	
	

}
