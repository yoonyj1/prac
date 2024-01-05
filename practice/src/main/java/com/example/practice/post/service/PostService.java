package com.example.practice.post.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.practice.post.dto.response.PostResponseDTO;
import com.example.practice.post.entity.Post;
import com.example.practice.post.repository.PostMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PostService {

	private final PostMapper postMapper;

	public PostResponseDTO findAll() {

		List<Post> postList = postMapper.findAll();

		return PostResponseDTO.builder().postList(postList).build();
	}

}
