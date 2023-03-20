package myo.pro.first.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import myo.pro.first.domain.Board;
import myo.pro.first.dto.BoardDTO;
import myo.pro.first.repository.BoardRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

}
