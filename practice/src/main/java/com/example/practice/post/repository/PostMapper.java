package com.example.practice.post.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.practice.post.entity.Post;

@Mapper
public interface PostMapper {

	List<Post> findAll();
	
	
	boolean insertPost(Post post);
}
