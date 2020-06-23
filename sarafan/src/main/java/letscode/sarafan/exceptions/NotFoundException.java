package letscode.sarafan.exceptions;

import com.fasterxml.jackson.databind.RuntimeJsonMappingException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException  {
}
