package com.example.finalexam;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Member {
		
		@Id //기본키
		public String id;
		public String pw;
		public String name;
		
}
