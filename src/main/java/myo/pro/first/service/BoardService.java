package myo.pro.first.service;

import myo.pro.first.domain.Board;
import myo.pro.first.dto.BoardDTO;

public interface BoardService {
    Long register(BoardDTO boardDTO);

    BoardDTO read(Long bno);

    void modify(BoardDTO boardDTO);

    void remove(Long bno);
}
