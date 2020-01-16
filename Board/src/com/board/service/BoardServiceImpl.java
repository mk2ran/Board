package com.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.board.domain.Board;
import com.board.persistence.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Resource
	private BoardMapper boardMapper;
	
	@Override
	public List<Board> list() {
		List<Board> board = boardMapper.list();
		return board;
	}

	@Override
	public void add(Board board) {
		boardMapper.add(board);
	}

	@Override
	public void delete(String bseq) {
		boardMapper.delete(bseq);
		
	}

}
