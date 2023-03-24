package myo.pro.first.Controller;

import myo.pro.first.exception.CustomException;
import myo.pro.first.exception.ErrorCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BoardApiController {

    @GetMapping("/test")
    public String  test(){
        throw new CustomException(ErrorCode.BAD_REQUEST);
    }
}
