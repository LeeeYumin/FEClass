package com.example.finalexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/create") //입력할거 띄어주고
	public String create() {
		return "create";
	}
	
	@PostMapping("/create")
	public String create(@ModelAttribute Member member) { //덩어리?로 받을때의 어노테이션.. 여기서 객체로 생성함..
		//글자로 하나씩 받을때의 어노테이션은 @RequestParam
		memberService.create(member);
		return "index";
	}
	
	@GetMapping("/") // index로 뿌려주자
	public String index(Model model) {
		model.addAttribute("members", memberService.readlist()); //여러개 가져가니까 s 붙여줌
		return "index";
	}
	

}
