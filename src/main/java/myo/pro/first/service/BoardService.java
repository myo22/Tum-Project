package myo.pro.first.service;

import myo.pro.first.domain.Board;
import myo.pro.first.dto.BoardDTO;
import myo.pro.first.dto.BoardRequestDTO;
import myo.pro.first.dto.PageRequestDTO;
import myo.pro.first.dto.PageResponseDTO;
import org.springframework.transaction.annotation.Transactional;

public interface BoardService {
    Long register(BoardDTO boardDTO);

    BoardDTO read(Long bno);

    void modify(BoardDTO boardDTO);

    void remove(Long bno);

    //PageResponseDTO<BoardDTO> list(PageRequestDTO pageRequestDTO);

    /**
     * 게시글 수정
     */
    Long update(Long bno,BoardDTO boardDTO);
}
