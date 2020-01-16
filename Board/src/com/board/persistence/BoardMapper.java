package com.board.persistence;

import java.util.List;

import com.board.domain.Board;

public interface BoardMapper {
	public List<Board> list();
	public void add(Board board);
	public void delete(String bseq);
}
