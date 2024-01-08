package com.example.practice.post.dto.response;

import com.example.practice.post.entity.Post;

import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class PostResponseDTO {
	
	private final String title;
	private final String content;
	
	public PostResponseDTO(Post post) {
		this.title = post.getTitle();
		this.content = post.getContent();
	}
	
	public static PostResponseDTO of(Post post) {
		return new PostResponseDTO(post);
	}

}
