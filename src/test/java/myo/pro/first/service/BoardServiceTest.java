package myo.pro.first.service;

import lombok.extern.log4j.Log4j2;
import myo.pro.first.domain.Board;
import myo.pro.first.dto.BoardDTO;
import myo.pro.first.repository.BoardRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
public class BoardServiceTest {

    @Autowired
    private BoardService boardService;

    @Test
    public void testRegister(){
        log.info(boardService.getClass().getName());

        BoardDTO boardDTO = BoardDTO.builder()
                .title("확인용")
                .content("이것또한 확인용")
                .writer("이건 나다")
                .build();
        Long bno = boardService.register(boardDTO);

        log.info("내가 등록한 번호: " + bno);
    }


}
