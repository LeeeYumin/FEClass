package com.example.visitors;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Visitor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //자동으로 증가되는 번호
	public Integer vid;  //고유번호
	
	
	public String vname;
	
	
	public String vmail;
	
	
	public LocalDateTime vdate;     //등록날짜
	
}