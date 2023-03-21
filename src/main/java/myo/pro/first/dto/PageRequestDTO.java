package myo.pro.first.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageRequestDTO {

    @Builder.Default //인스턴스를 만들 때 특정 필드를 특정 값으로 초기화하고 싶다면
    private int page = 1;

    @Builder.Default
    private int size = 10;

    private  String type; // 검색의 종류 t,c,w,tc,tw,twc

    private  String keyword;

    //BoardRepository 에서 검색조건들을 String[]로 처리하기 때문에 type 이라는 문자열을 배열로 반환해 주는 기능이 필요하다.
    public String[] getTypes() {
        if(type == null || type.isEmpty()){
            return null;
        }
        return type.split("");
    }

    public Pageable getPageable(String...props){
        return PageRequest.of(this.page -1, this.size, Sort.by(props).descending());
    }

    private String link;

    //검색 조건과 페이징 조건 등을 문자열로 구성
    private String getLink() {

        if (link == null){
            StringBuilder builder = new StringBuilder();

            builder.append("page=" + this.page);

            builder.append("&size=" + this.size);

            if (type != null && type.length() > 0){
                builder.append("&type=" + type);
            }

            if (keyword != null){
                try{
                    builder.append("&keyword=" + URLEncoder.encode(keyword, "UTF-8")); //한글을 ASCII값으로 인코딩해주야 합니다. url을 한글로 바꾸는건 decode이다.
                } catch (UnsupportedEncodingException e){
                }
            }
            link = builder.toString();
        }
        return link;
    }
}
