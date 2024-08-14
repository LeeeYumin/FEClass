package com.example.finalexam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
	
	@Autowired
	private BoardRepository boardRepository;
	
	public void create(Board board) {
		boardRepository.save(board);
	}
	
	public List<Board> readlist() {
		return boardRepository.findAll();
	}

}
