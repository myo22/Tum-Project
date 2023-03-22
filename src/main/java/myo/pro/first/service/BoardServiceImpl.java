package myo.pro.first.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import myo.pro.first.domain.Board;
import myo.pro.first.dto.BoardDTO;
import myo.pro.first.dto.PageRequestDTO;
import myo.pro.first.dto.PageResponseDTO;
import myo.pro.first.repository.BoardRepository;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Pageable;
import java.util.Optional;

@Service //해당 클래스를 루트 컨테이너에 빈(Bean) 객체로 생성해주는 어노테이션입니다.
@Log4j2
@Transactional //데이터 추가, 갱신, 삭제 등으로 이루어진 작업을 처리하던 중 오류가 발생했을 때 모든 작업들을 원상태로 되돌릴 수 있다. 모든 작업들이 성공해야만 최종적으로 데이터베이스에 반영하도록 한다.(당근마켓 벽돌방지)
@RequiredArgsConstructor //final이 붙거나 @NotNull 이 붙은 필드의 생성자를 자동 생성해주는 롬복 어노테이션
public class BoardServiceImpl implements BoardService{

    private final BoardRepository boardRepository;

    private final ModelMapper modelMapper;

    @Override
    public Long register(BoardDTO boardDTO){

        Board board = modelMapper.map(boardDTO, Board.class);

        Long bno = boardRepository.save(board).getBno();

        return bno;
    }

    @Override
    public BoardDTO read(Long bno){

        Optional<Board> result = boardRepository.findById(bno);

        Board board = result.orElseThrow();

        BoardDTO boardDTO = modelMapper.map(board, BoardDTO.class);

        return boardDTO;
    }

    @Override
    public void modify(BoardDTO boardDTO){

        Optional<Board> result = boardRepository.findById(boardDTO.getBno());

        Board board = result.orElseThrow();

        board.chage(boardDTO.getTitle(), boardDTO.getContent(), boardDTO.getWriter());

        boardRepository.save(board);

    }

    @Override
    public void remove(Long bno){

        boardRepository.deleteById(bno);

    }

    /*
    @Override
    public PageResponseDTO<BoardDTO> list(PageRequestDTO pageRequestDTO){

        String[] types = pageRequestDTO.getTypes();
        String keyword = pageRequestDTO.getKeyword();
        Pageable pageable = pageRequestDTO.getPageable("bno");

        Page<Board> result = boardRepository.searchAll(types, keyword, pageable);

        return null;
    }
    */

}
