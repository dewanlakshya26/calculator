package lakshya.calculation.calculator.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ValidationController {

    Logger logger = LoggerFactory.getLogger(ValidationController.class);


    @ExceptionHandler(HttpMessageNotReadableException.class)
    ResponseEntity<String> handleConstraintViolationException(HttpMessageNotReadableException e) {
        logger.error("validation exception occoured");
        return new ResponseEntity<>("not valid due to validation error: " + e.getMessage(), HttpStatus.BAD_REQUEST);
    }
}
