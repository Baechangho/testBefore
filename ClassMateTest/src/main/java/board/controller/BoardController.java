package board.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import board.service.face.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {

	//시러여
	private final Logger logger = LoggerFactory.getLogger( this.getClass() );
	
	@Autowired BoardService boardService;
	
	//추가한 주석
	
	//또 추가한 주석
	//또또 추가한 주석
	//또또 추가한 주석
	//또또 추가한 주석
	//또또 추가한 주석
	//또또 추가한 주석
	//또또 추가한 주석
	//또또 추가한 주석
	//또또 추가한 주석
	//또또 추가한 주석
	//또또 추가한 주석
	//또또 추가한 주석
	//또또 추가한 주석
	//또또 추가한 주석
	//또또 추가한 주석
	//또또 추가한 주석
	//또또 추가한 시진핑국가주석
	
	@GetMapping("/board")
	public void board() {
		logger.info("/board/board [GET]");
		System.out.println("우왕 굿 ㅋ");
	}
	
}
