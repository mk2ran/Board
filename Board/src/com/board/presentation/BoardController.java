package com.board.presentation;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.board.domain.Board;
import com.board.service.BoardService;

@Controller
@RequestMapping(value = "/board")
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView getList(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView("/board/list");
		List<Board> board = boardService.list();
		modelAndView.addObject("boardList", board);
		return modelAndView;
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView getAdd(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView("/board/add");
		return modelAndView;
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView postAdd(Board board, HttpServletRequest request, HttpServletResponse response) {
		if(board.getbTitle().isEmpty() || board.getbContent().isEmpty()) {
			return new ModelAndView(new RedirectView("/board/list"));
		}else {
			SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
			Date time = new Date();
			String time1 = format1.format(time);
			board.setbDate(time1);
			System.out.println(board.toString());
			boardService.add(board);
			
			return new ModelAndView(new RedirectView("/board/list"));
		}
	}
	
	@RequestMapping(value = "/delete/{bseq}", method = RequestMethod.GET)
	public ModelAndView getDelete(@PathVariable String bseq, HttpServletRequest request, HttpServletResponse response) {
		
		boardService.delete(bseq);
		
		return new ModelAndView(new RedirectView("/board/list"));
	}
}
