package com.nomad.demo.repository;

import com.nomad.demo.domain.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
	Long countByCategoryId(Long categoryId);
	List<Post> findAllByCategoryId(Long categoryId);
}
