package com.board.service;

import java.util.List;

import com.board.domain.Board;

public interface BoardService {
	public List<Board> list();
	public void add(Board board);
	public void delete(String bseq);
}
