package myo.pro.first.hanlder;


import lombok.extern.log4j.Log4j2;
import myo.pro.first.exception.CustomException;
import myo.pro.first.exception.ErrorCode;
import myo.pro.first.exception.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice //@ControllerAdvice는 컨트롤러 전역에서 발생할 수 있는 예외를 잡아 Throw 해주고, @ExceptionHandler는 특정 클래스에서 발생할 수 있는 예외를 잡아 Throw 합니다.
@Log4j2
public class GlobalExceptionHandler {

    /*
    @ExceptionHandler(RuntimeException.class) //@ExceptionHandler에 지정된 예외와 동일한 예외, 즉 RuntimeException이 발생하면 GlobalExceptionHandler는 handleRuntimeException( ) 메서드를 실행합니다.
    public String handleRuntimeException(final RuntimeException e){
        log.error("handleRuntimeException : {}", e.getMessage());
        return e.getMessage();
    }
    */

    /*
     * Developer Custom Exception
     */
    @ExceptionHandler(CustomException.class)
    protected ResponseEntity<ErrorResponse> handleCustomException(final CustomException e){ //ResponseEntity 클래스를 사용하면, 결과값! 상태코드! 헤더값!을 모두 프론트에 넘겨줄 수 있고, 에러코드 또한 섬세하게 설정해서 보내줄 수 있다는 장점이 있다
        log.error("handleCustomException: {}", e.getErrorCode());
        return ResponseEntity //우리는 예외가 발생했을 때, ErrorResponse 형식으로 예외 정보를 Response로 내려주게 됩니다.
                .status(e.getErrorCode().getStatus().value())
                .body(new ErrorResponse(e.getErrorCode())); //http header에는 (요청/응답)에 대한 요구사항이 http body에는 그 내용이 적혀있다
    }

    /*
     * HTTP 405 Exception
     */
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    protected ResponseEntity<ErrorResponse> handleHttpRequestMethodNotSupportedException(final HttpRequestMethodNotSupportedException e){
        log.error("handleHttpRequestMethodNotSupportedException: {}", e.getMessage());
        return ResponseEntity
                .status(ErrorCode.METHOD_NOT_ALLOWED.getStatus().value())
                .body(new ErrorResponse(ErrorCode.METHOD_NOT_ALLOWED));
    }

    /*
     * HTTP 500 Exception
     */
    @ExceptionHandler(Exception.class)
    protected ResponseEntity<ErrorResponse> handleException(final Exception e) { //HTTP Request에 대한 응답 데이터를 포함하는 클래스로,<Type>에 해당하는 데이터와 HTTP 상태 코드를 함께 리턴할 수 있습니다.
        log.error("handleException: {}", e.getMessage());
        return ResponseEntity
                .status(ErrorCode.INTERNAL_SERVER_ERROR.getStatus().value())
                .body(new ErrorResponse(ErrorCode.INTERNAL_SERVER_ERROR));
    }
}
