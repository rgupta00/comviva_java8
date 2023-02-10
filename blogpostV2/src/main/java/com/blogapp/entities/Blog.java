package com.blogapp.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "blog_table")
public class Blog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "{blog.title.absent}")
	private String title;
	
	@NotNull(message = "{blog.author.absent}")
	private String author;
	
	@NotNull(message = "{blog.content.absent}")
	private String content;

	@OneToMany(mappedBy = "blog", cascade = CascadeType.ALL)
	//@JsonIgnore
	List<Comment> comments = new ArrayList<Comment>();

	public void addComment(Comment comment) {
		comments.add(comment);
		comment.setBlog(this);
	}

	public void removeComment(Comment comment) {
		comments.remove(comment);
		comment.setBlog(null);
	}

	public Blog(String title, String author, String content) {
		super();
		this.title = title;
		this.author = author;
		this.content = content;
	}

	@Override
	public String toString() {
		return "Blog [id=" + id + ", title=" + title + ", author=" + author + ", content=" + content + "]";
	}
	
	

}
