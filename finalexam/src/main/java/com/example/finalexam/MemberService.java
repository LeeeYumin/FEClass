package com.example.finalexam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired //객체 생성
	private MemberRepository memberRepository; //MemberRepository 라는 클래스에 memberRepository 라는 객체를 생성해서 던져줌
	
	public void create(Member member) { //컨트롤러의 create에서 데이터를 받아서
		memberRepository.save(member); //메서드 생성해줌
	}
	
	public List<Member> readlist() {
		return memberRepository.findAll(); //전체 목록을 모두 찾아서 가지고 컨트롤러로 가지고 감
	}
}
