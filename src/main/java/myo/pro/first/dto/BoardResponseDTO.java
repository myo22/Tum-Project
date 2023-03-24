package myo.pro.first.dto;

import lombok.Getter;
import myo.pro.first.domain.Board;

import java.time.LocalDateTime;

@Getter
public class BoardResponseDTO {
    private Long bno;
    private String title;
    private String content;
    private String writer;
    private LocalDateTime regDate;
    private LocalDateTime modDate;

    public BoardResponseDTO(Board entity) {
        this.bno = entity.getBno();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.writer = entity.getWriter();
        this.regDate = entity.getRegDate();
        this.modDate = entity.getModDate();
    }
}
