package com.blogapp.entities;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
@Table(name="comment_table")
public class Comment {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String comment;
	private LocalDateTime createdAt;
	
	@JoinColumn(name="bid_fk")
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	
	@JsonIgnore
	private Blog blog;
	
	
	public Blog getBlog() {
		return blog;
	}
	public void setBlog(Blog blog) {
		this.blog = blog;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public Comment(String comment) {
		this.comment = comment;
		this.createdAt = LocalDateTime.now();
	}
	
	public Comment(Blog blog, String comment) {
		this.blog=blog;
		this.comment = comment;
		this.createdAt = LocalDateTime.now();
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", comment=" + comment + ", createdAt=" + createdAt + "]";
	}
	

}