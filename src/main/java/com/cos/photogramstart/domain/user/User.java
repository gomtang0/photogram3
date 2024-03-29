package com.cos.photogramstart.domain.user;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//JPA - java Persistence API  (자바로 데이터를 영구적으로 저장할 수 있는 API를 제공)


@Table(name="user_tb")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity // DB에 테이블을 생성
public class User {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)

	private int id;
	private String username;
	private String password;

	private String name;
	private String website;
	private String bio; // 자기소개
	private String email;
	private String phone;
	private String gender;

	private String profileImageUrl; // 사진
	private String role; // 권한

	private LocalDateTime createDate;

	@PrePersist // DB에 insert 되기 직전에 실행
	public void createDate() {
		this.createDate = LocalDateTime.now();
	}

}