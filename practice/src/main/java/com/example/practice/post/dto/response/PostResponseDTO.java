package com.example.practice.post.dto.response;

import java.util.List;

import com.example.practice.post.entity.Post;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostResponseDTO {

	private List<Post> postList;
	
}
