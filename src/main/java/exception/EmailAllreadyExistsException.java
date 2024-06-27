package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class EmailAllreadyExistsException extends ResponseStatusException {
    public EmailAllreadyExistsException(String reason) {
        super(HttpStatus.BAD_REQUEST, reason);
    }
}
