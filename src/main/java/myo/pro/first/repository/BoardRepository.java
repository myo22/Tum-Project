package myo.pro.first.repository;

import myo.pro.first.domain.Board;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import search.BoardSearch;

//BoardRepository를 이용해서 작성된 테이블에 SQL문 없이 CRUD 작업을 할 수 있게 됩니다.
//JpaRepository의 제네릭 타입으로는 <Entity, PK의 타입>을 지정해주면 Spring Data JPA는 자동으로 스프링의 빈(bean)으로 등록됩니다.
//Spring이 내부적으로 인터페이스 타입에 맞는 객체를 생성해서 bean으로 등록
public interface BoardRepository extends JpaRepository<Board, Long>, BoardSearch {

    @Query(value ="select now()", nativeQuery = true) //@Query로 작성했던 JPQL을 코드를 통해서 생성할 수 있게합니다.
    String getTime();
}
