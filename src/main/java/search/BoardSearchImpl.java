package search;

import com.querydsl.jpa.JPQLQuery;
import myo.pro.first.domain.Board;
import myo.pro.first.domain.QBoard;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

//Querydsl의 목적은 '타입' 기반으로 '코드'를 이용해서 JPQL쿼리를 생성하고 실행하는 것이다.
public class BoardSearchImpl extends QuerydslRepositorySupport implements BoardSearch {

    public BoardSearchImpl(){
        super(Board.class);
    }

    @Override
    public Page<Board> search1(Pageable pageable){

        QBoard board = QBoard.board; //Q도메인 객체

        JPQLQuery<Board> query = from(board); // select.. from board

        query.where(board.title.contains("1")); // where title like ...

        List<Board> list = query.fetch(); //fetch()로 JPQL쿼리를 실행

        Long count = query.fetchCount();

        return null;
    }
}
