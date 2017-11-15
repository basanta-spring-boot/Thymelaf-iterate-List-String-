package com.iterate.list.string.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class IterateApplication {

	public static void main(String[] args) {
		SpringApplication.run(IterateApplication.class, args);
	}

	@RequestMapping("/iterate")
	public String check(Model model) {
		TestModel greeting = new TestModel();
		List<String> list = new ArrayList<>();
		list.add("Basanta");
		list.add("Santosh");
		greeting.setList(list);
		model.addAttribute("greeting", greeting);
		return "index";
	}
}
