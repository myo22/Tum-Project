package myo.pro.first;

import myo.pro.first.domain.Board;
import myo.pro.first.repository.BoardRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import lombok.extern.log4j.Log4j2;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
@Log4j2
public class DataSourceTests {

    @Autowired
    BoardRepository boardRepository;

    @Test
    public void testInsert(){
        IntStream.rangeClosed(1, 10).forEach( i -> {
            Board board = Board.builder()
                    .content("처음 만든 문장.." + i)
                    .writer("이민형" + (i * 10))
                    .title("첫문장." + i)
                    .build();
            Board result = boardRepository.save(board);
            log.info("Bno: " + result.getBno());
        });
    }

    @Test
    public void testRead(){
        Long bno = 5L;
        Optional<Board> result = boardRepository.findById(bno); ////Optional은 null 또는 값을 감싸서 NPE로부터 부담을 줄이기 위해 등장한 클래스이다.
        Board board = result.orElseThrow(); //orElseThrow는 Optional의 인자가 null일 경우 예외처리를 시킨다.
        log.info(board);

    }
}
