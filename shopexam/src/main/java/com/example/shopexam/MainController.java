package com.example.shopexam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@GetMapping("/") //홈=인덱스
	public String index() {
		return "index";
	}
	
	@GetMapping("/productlist")  //제품 목록 보기
	public String productlist() {
		return "productlist";
	}
	
	@GetMapping("/prodetail")  //제품 상세 보기
	public String prodetail() {
		return "prodetail";
	}
	
	@GetMapping("/notice") //공지
	public String getnotice() {
		return "notice";
	}
	
	@PostMapping("/notice") //공지 등록 후
	public String postcreate(@RequestParam ("title") String title, 
							@RequestParam ("contents") String contents) {
		System.out.println("공지사항 제목  _  " + title);
		System.out.println("공지사항 내용  _  " + contents);
		return "notice";
	}
	
	
}
