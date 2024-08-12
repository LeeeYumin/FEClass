package com.example.mallexam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@GetMapping("/") //홈=인덱스
	public String index() { //메서드는 동일한 이름만!
		return "index";
	}
	
	@GetMapping("/main")  // 주소창에 /main 이라고 들어오면
	public String main() {
		return "main"; // main.html 을 호출하자
	}
	
	@GetMapping("/login") //보낼때는 GetMapping
	public String getlogin() {
		return "login";
	}
	
	@PostMapping("/login") //받을때는 PostMapping. 받을때도 로그인 경로로 받아줌
	public String postlogin(@RequestParam ("email") String email, //키값으로 이메일
							@RequestParam ("password") String password) { 
		System.out.println(email);
		System.out.println(password);
		return "login";
	}
	
	@GetMapping("/freqstore") //자주 찾는 가게
	public String freqstore() {
		return "freqstore";
	}
	
	@GetMapping("/prodlist") //제품목록
	public String prodlist() {
		return "prodlist";
	}
	
	@GetMapping("/wishlist") //찜
	public String wishlist() {
		return "wishlist";
	}
	
	@GetMapping("/shoppinginfo") //쇼핑정보
	public String shoppinginfo() {
		return "shoppinginfo";
	}
	
	@GetMapping("/seller") //판매자되기
	public String seller() {
		return "seller";
	}
	
	@GetMapping("/delitrack") //주문 추적
	public String delitrack() {
		return "delitrack";
	}
	
	@GetMapping("/payhistory") //결제
	public String payhistory() {
		return "payhistory";
	}
	
	@GetMapping("/productdetails") //제품 상세보기
	public String productdetails() {
		return "productdetails";
	}
	
	@GetMapping("/products") //제품목록
	public String products() {
		return "products";
	}
	
	
	@GetMapping("/create") //게시글 등록
	public String getcreate() {
		return "create";
	}
	
	@PostMapping("/create") //등록 후
	public String postcreate(@RequestParam ("title") String title, 
						@RequestParam ("contents") String contents) {
		System.out.println("입력하신 제목은" + title);
		System.out.println("입력하신 내용은" + contents);
		return "index";
	}
	
	
}
