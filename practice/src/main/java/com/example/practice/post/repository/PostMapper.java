package com.example.practice.post.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.practice.post.entity.Post;

@Mapper
public interface PostMapper {

	// C
	boolean createPost(Post post);
	
	// R
	List<Post> findAll();
	
	Post findPostByIdx(Long idx);
	
	// U
	boolean modifyPost(Post post);
	
	// D
	boolean deletePost(Long idx);

}
