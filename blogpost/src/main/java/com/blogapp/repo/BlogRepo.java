package com.blogapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blogapp.entities.Blog;
@Repository
public interface BlogRepo extends JpaRepository<Blog, Long>{
}