package com.springbook.domain;

import java.sql.Timestamp;

import lombok.Data;

//lombok에서 지원하는 getter/setter/ToSting자동생성

//@Getter@Setter@ToString
@Data
public class BoardDTO {
	
	
	//properties
	private int seq;
	private String title;
	private String writer;
	private String content;
	private Timestamp regdate;
	private int cnt;
	
}
