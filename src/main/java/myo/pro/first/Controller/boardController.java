package myo.pro.first.Controller;

import lombok.extern.log4j.Log4j2;
import myo.pro.first.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/board")
@Log4j2
public class boardController {

    @Autowired
    BoardRepository boardRepository;

    @GetMapping("/read")
    public void read(Model model){
        log.info("read........");
        model.addAttribute("msg", "read");
    }
}
