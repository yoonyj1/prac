package com.example.practice.post.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Data
@Builder
public class Post {
	
	private Long idx;
	private String title;
	private String content;
	
	public void modify(String title, String content) {
		this.title = title;
		this.content = content;
	}



}
