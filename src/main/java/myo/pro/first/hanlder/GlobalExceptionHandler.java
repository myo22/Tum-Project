package myo.pro.first.hanlder;


import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice //@ControllerAdvice는 컨트롤러 전역에서 발생할 수 있는 예외를 잡아 Throw 해주고, @ExceptionHandler는 특정 클래스에서 발생할 수 있는 예외를 잡아 Throw 합니다.
@Log4j2
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class) //@ExceptionHandler에 지정된 예외와 동일한 예외, 즉 RuntimeException이 발생하면 GlobalExceptionHandler는 handleRuntimeException( ) 메서드를 실행합니다.
    public String handleRuntimeException(final RuntimeException e){
        log.error("handleRuntimeException : {}", e.getMessage());
        return e.getMessage();
    }
}
