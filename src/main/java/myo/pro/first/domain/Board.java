package myo.pro.first.domain;

import lombok.*;

import javax.persistence.*;

@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity //DB의 테이블을 뜻함 [ Spring Data JPA 에서는 반드시 @Entity 어노테이션을 추가해야함]
@Table(name = "board")  //DB 테이블의 이름을 명시 [ 테이블 명과 클래스 명이 동일한 경우 생략가능 ]
public class Board {

    @Id // Privary Key를 뜻함
    @GeneratedValue(strategy = GenerationType.IDENTITY) //MySQL의 Auto_INCREMENT를 사용 Primary Key의 키 생성 전략(Strategy)을 설정하고자 할 때 사용
    private Long bno;

    @Column(length = 2000, nullable = false)
    private String content;

    @Column(length = 500, nullable = false) //컬럼의 길이와 null 허용여부 , DB Column을 명시
    private String title;

    @Column(length = 50, nullable = false)
    private String writer;

}
