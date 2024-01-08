package com.example.practice.post.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.post.dto.request.PostRequestDTO;
import com.example.practice.post.dto.response.PostListResponseDTO;
import com.example.practice.post.dto.response.PostResponseDTO;
import com.example.practice.post.entity.Post;
import com.example.practice.post.service.PostService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PostController {

	private final PostService postService;

	@GetMapping("/hellooo")
	public String hello() {
		return "hello";
	}

	// C
	@PostMapping("/posts")
	public ResponseEntity<?> createPost(@RequestBody @Valid PostRequestDTO requestDTO) {
		PostResponseDTO responseDTO = postService.createPost(requestDTO);
		return ResponseEntity.ok().body(responseDTO);
	}

	// R
	@GetMapping("/postlist")
	public ResponseEntity<?> findAll() {
		PostListResponseDTO responseDTO = postService.findAll();
		System.out.println("-------");
		System.out.println(responseDTO);
		return ResponseEntity.ok().body(responseDTO);
	}

	// U
//	@PutMapping("/posts/{idx}")
//	public ResponseEntity<?> modifyPost(
//			@PathVariable(name = "idx", required = true) Long idx, @RequestBody @Valid PostRequestDTO requestDTO) {
//		PostResponseDTO responseDTO = postService.modifyPost(idx, requestDTO);
//		return ResponseEntity.ok().body(responseDTO);
//		// TODO : 제목과 내용 둘 중 하나만 적는경우 기존꺼 그대로 가져가려면?
//	}
//
//	// D
//	@DeleteMapping("/posts/{idx}")
//	public ResponseEntity<?> deletePost(@PathVariable Long idx) {
//		PostResponseDTO responseDTO = postService.deletePost(idx);
//		return ResponseEntity.ok().body(responseDTO);
//	}

}
