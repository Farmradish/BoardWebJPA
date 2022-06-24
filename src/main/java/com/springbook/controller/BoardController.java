package com.springbook.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbook.domain.BoardDTO;

@RestController
public class BoardController {
	
	public BoardController() {
		System.out.println("=> BoardController() Constructor");
	}
	
	// 문자열을 리턴
	
	@GetMapping("/hi")
	public String hi(String name) {
		return "Hi: " + name;
	}
	
	// 객체(BoardDTO) 리턴 -> JSON 사용
	
	@GetMapping("/getBoard")
	public BoardDTO getBoard() {
		BoardDTO board = new BoardDTO();
		board.setSeq(1);
		board.setTitle("스프링 부트1");
		board.setWriter("개발자");
		board.setContent("스프링 부트 공구하고 있습니다.");
		board.setRegdate(new Timestamp(System.currentTimeMillis()));
		board.setCnt(0);
		return board;
	}
	
	// 컬랙션(List) 리턴 -> JSON 사용
	
	@GetMapping("/getBoardList")
	public List<BoardDTO> getBoardList(){
		List<BoardDTO> boardList = new ArrayList<BoardDTO>();
		for(int i=0;i<10;i++) {
			BoardDTO board = new BoardDTO();
			board.setSeq(i);
			board.setTitle("스프링 부트" + i);
			board.setWriter("개발자" + i);
			board.setContent("리스트의" + i +"번째입니다.");
			board.setRegdate(new Timestamp(System.currentTimeMillis()));
			board.setCnt(0);
			boardList.add(board);
		}
		return boardList;
	}
}
