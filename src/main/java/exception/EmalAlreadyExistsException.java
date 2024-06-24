package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class EmalAlreadyExistsException extends ResponseStatusException {
    public EmalAlreadyExistsException(String reason) {
        super(HttpStatus.BAD_REQUEST, reason);
    }
}
