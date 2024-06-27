package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class NameAllreadyExistsException extends ResponseStatusException {
    public NameAllreadyExistsException(String reason) {
        super(HttpStatus.BAD_REQUEST, reason);
    }
}
