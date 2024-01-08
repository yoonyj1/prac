package com.example.practice.post.dto.response;

import java.util.List;

import com.example.practice.post.entity.Post;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
public class PostListResponseDTO {

	private List<Post> postList;
}
