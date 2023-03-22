package myo.pro.first.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter //모든 필드에 접근자와 설정자가 자동으로 생성됩니다.
@ToString
public class PageResponseDTO<E> {
//String 타입도 지원하고싶고 Integer타입도 지원하고 싶고 많은 타입을 지원하고 싶다. 그러면 String에 대한 클래스, Integer에 대한 클래스 등 하나하나 타입에 따라 만들 것인가? 그건 너무 비효율적이다. 이러한 문제를 해결하기 위해 우리는 제네릭이라는 것을 사용한다.
    private int page;
    private int size;
    private int total;

    //시작 페이지 번호
    private int start;
    //끝 페이지 번호
    private  int end;

    //이전 페이지의 존재 여부
    private boolean prev;
    //다음 페이지의 존재 여부
    private boolean next;

    private List<E> dtoList;

    @Builder(builderMethodName = "withAll") //기존 builder 이름을 withAll 로 변경
    public PageResponseDTO(PageRequestDTO pageRequestDTO, List<E> dtoList, int total){

        if (total <= 0){
            return;
        }

        this.page = pageRequestDTO.getPage();
        this.size = pageRequestDTO.getSize();

        this.total = total;
        this.dtoList = dtoList;

        this.end = (int)(Math.ceil(this.page / 10.0 )) * 10; //화면에서의 마지막 번호

        this.start = this.end - 9; //화면에서의 시작 번호

        int last = (int)(Math.ceil((total/(double)size))); //데이터의 개수를 계산한 마지막 페이지 번호

        this.end = end > last ? last: end;

        this.prev = this.start > 1;

        this.next = total > this.end * this.size;
    }
}
