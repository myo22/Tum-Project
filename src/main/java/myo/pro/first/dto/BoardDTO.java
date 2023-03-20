package myo.pro.first.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data //롬복의 어노테이션으로 Getter과 Setter를 직접 구현하지 않아도 사용할 수 있게 해주는 어노테이션이다.
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {
    private Long bno;

    private String content;

    private String title;

    private String writer;

    private LocalDateTime regDate;

    private  LocalDateTime modDate;

}
