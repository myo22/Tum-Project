package myo.pro.first.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass //해당 어노테이션은 객체의 입장에서 '생성 시간', '수정 시간' 같은 공통 매핑 정보가 필요할 때 사용됩니다.
@Getter
@EntityListeners(value = {AuditingEntityListener.class}) //JPA Entity에서 이벤트가 발생할 때마다 특정 로직을 실행시킬 수 있는 어노테이션입니다.
public class BaseTime {
    //테이블에서 공통적으로 사용될 컬럼이니만큼 각각의 Entity에 생성하는 것보다 부모 클래스로 만들어 상속받아서 사용하는 것이 효율적

    @CreatedDate
    @Column(name = "regdate") //JPA에서 DB Table의 Column을 Mapping 할 때 @Column Annotation을 사용한다.
    private LocalDateTime regDate;

    @LastModifiedDate
    @Column(name = "moddate")
    private  LocalDateTime modDate;
}
