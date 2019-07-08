package employee;

public class EmployeeAlreadyBusyException extends RuntimeException {
    public EmployeeAlreadyBusyException(String message) {
        super(message);
    }

    EmployeeAlreadyBusyException(String message, Throwable cause) {
        super(message, cause);
    }
}
