package com.example.practice.post.dto.request;

import com.example.practice.post.entity.Post;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Getter;


@Getter
@Data
public class PostRequestDTO {

	@NotBlank(message = "제목을 입력해주세요.")
	private String title;

	@NotBlank(message = "내용을 입력해주세요.")
	private String content;

	public Post toEntity() {
		return Post.builder().title(this.title).content(this.content).build();
	}
}
