package mock;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class ValueNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(ValueNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String valueNotFoundHandler(ValueNotFoundException ex) {
        return ex.getMessage();
    }
}
