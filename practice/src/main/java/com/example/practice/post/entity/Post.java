package com.example.practice.post.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Post {
	
	private String title = "";
	private String content = "";

}
