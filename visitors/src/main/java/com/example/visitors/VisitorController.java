package com.example.visitors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VisitorController {
	
	@Autowired
	private VisitorService visitorService;
	
	@GetMapping("/")
	public String index(Model model) {
		
		model.addAttribute("visitors", visitorService.readlist());
		
		return "index";
	}
	
	@PostMapping("/")
	public String index(@ModelAttribute Visitor visitor) { //visitor 를 객체로 받자
		
		System.out.println("컨트롤러에서 확인 vname " + visitor.getVname());

		visitorService.create(visitor);
		
		return "redirect:/";
	}

}
