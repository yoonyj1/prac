package com.example.practice.post.dto.request;

import com.example.practice.post.entity.Post;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;
import lombok.Getter;

@Getter
@Data
public class PostModifyRequestDTO {

	@NotNull(message = "원본 글 번호를 입력하세요.")
	@PositiveOrZero(message = "원본 글 번호는 0이상의 양수만 가능합니다.")
	private Long idx;
	@NotBlank(message = "수정할 제목을 입력해주세요.")
	private String title;
	@NotBlank(message = "수정할 내용을 입력해주세요.")
	private String content;


	public Post toEntity() {
		return Post.builder().idx(this.idx).title(this.title).content(this.content).build();
	}
}
