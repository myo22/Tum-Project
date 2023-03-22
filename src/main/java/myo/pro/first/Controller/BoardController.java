package myo.pro.first.Controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import myo.pro.first.dto.PageRequestDTO;
import myo.pro.first.service.BoardService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@RequestMapping("/board")
@Log4j2
public class BoardController {

    final BoardService boardService;

    @GetMapping("/list")
    public void read(PageRequestDTO pageRequestDTO){

    }
}
