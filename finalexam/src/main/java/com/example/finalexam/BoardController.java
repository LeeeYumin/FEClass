package com.example.finalexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/boardcreate")
	public String boardcreate() {
		return "boardcreate";
	}
	
	@PostMapping("/boardcreate")
	public String boardcreate(Board board) {
	boardService.create(board);
	return "index";
}
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("boards", boardService.readlist());
		return "index";
	}

}