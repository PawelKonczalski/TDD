package employee;

public class EmployeeDbException extends RuntimeException {

    public EmployeeDbException(String message) {
        super(message);
    }

    EmployeeDbException(String message, Throwable cause) {
        super(message, cause);
    }
}
