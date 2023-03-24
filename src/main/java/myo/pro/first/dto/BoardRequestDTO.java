package myo.pro.first.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import myo.pro.first.domain.Board;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class BoardRequestDTO {
    //Entity 클래스는 테이블(Table) 또는 레코드(Record) 역할을 하는 데이터베이스 그 자체 절대로 요청(Request)이나 응답(Response)에 사용되어서는 안 되기 때문에 Request, Response 클래스를 따로 생성(구분)

    private String title; // 제목
    private String content; // 내용
    private String writer; // 작성자


    public Board toEntity(){
        return Board.builder()
                .title(title)
                .content(content)
                .writer(writer)
                .build();

    }
}
