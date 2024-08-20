package com.example.visitors;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitorService {
	
	@Autowired
	private VisitorRepository visitorRepository;

	public void create(Visitor visitor) {
		
		visitor.setVdate(LocalDateTime.now());
		
		visitorRepository.save(visitor);
	}
	
	public List<Visitor> readlist() {
		return visitorRepository.findAll();
	}
	
}