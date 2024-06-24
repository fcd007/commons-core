package exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.SQLIntegrityConstraintViolationException;

@ControllerAdvice
public class GlobalErrorHandleAdvice {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<DefaultErrorMessage> handleNotFoundException(NotFoundException exception) {

        var erroResponse = new DefaultErrorMessage(HttpStatus.NOT_FOUND.value(), exception.getReason());

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erroResponse);
    }

    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public ResponseEntity<DefaultErrorMessage> handleSqlIntegrityConstraintViolationException(SQLIntegrityConstraintViolationException exception) {

        var erroResponse = new DefaultErrorMessage(HttpStatus.BAD_REQUEST.value(), "Integrity Constraint Violation Exception");

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erroResponse);
    }
}
