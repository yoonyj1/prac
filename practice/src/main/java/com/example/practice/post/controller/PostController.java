package com.example.practice.post.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.post.dto.response.PostResponseDTO;
import com.example.practice.post.service.PostService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PostController {

	private final PostService postService;

	@GetMapping("/post")
	public ResponseEntity<?> findAll() {

		PostResponseDTO dto = postService.findAll();

		System.out.println(dto);
		return ResponseEntity.ok().body(dto);
	}

}
