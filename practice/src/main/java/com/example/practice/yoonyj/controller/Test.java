package com.example.practice.yoonyj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.yoonyj.service.TestService;

import lombok.RequiredArgsConstructor;


@Controller
@RequiredArgsConstructor
public class Test {

	private final TestService testService;

	@GetMapping(value = "/getPage")
	public String testPage() {
		return "testPage";
	}
}
