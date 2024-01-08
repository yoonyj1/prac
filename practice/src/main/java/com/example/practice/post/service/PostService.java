package com.example.practice.post.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.practice.post.dto.request.PostRequestDTO;
import com.example.practice.post.dto.response.PostListResponseDTO;
import com.example.practice.post.dto.response.PostResponseDTO;
import com.example.practice.post.entity.Post;
import com.example.practice.post.exception.PostCreationException;
import com.example.practice.post.repository.PostMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PostService {

	private final PostMapper postMapper;

	// C
	public PostResponseDTO createPost(PostRequestDTO requestDTO) {
		Post post = requestDTO.toEntity();
		if (!postMapper.createPost(post)) {
			throw new PostCreationException("글 작성에 실패하였습니다.");
		}
		return PostResponseDTO.of(post);
	}
	
	// R
	public PostListResponseDTO findAll() {
		System.out.println("===========================");
		List<Post> postList = postMapper.findAll();
		System.out.println(postList);
		return PostListResponseDTO.builder().postList(postList).build();
	}

	// U
	public PostResponseDTO modifyPost(Long idx, PostRequestDTO requestDTO) {
		Post post = findPostByIdx(idx);
		post.modify(requestDTO.getTitle(), requestDTO.getContent());
		if(!postMapper.modifyPost(post)) {
			System.out.println("글 수정에 실패하였습니다.");
		}
		return PostResponseDTO.of(post);
	}

	// D
	public PostResponseDTO deletePost(Long idx) {
		Post post = findPostByIdx(idx);
		postMapper.deletePost(idx);
		return PostResponseDTO.of(post);
	}
	
	private Post findPostByIdx(Long idx) {
		Post post = postMapper.findPostByIdx(idx);
	    if (post == null) {
	        throw new IllegalArgumentException("존재하지 않는 게시글 번호입니다: " + idx);
	    }
	    return post;
	}

}
