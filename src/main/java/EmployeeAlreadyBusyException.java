class EmployeeAlreadyBusyException extends RuntimeException {
    EmployeeAlreadyBusyException(String message) {
        super(message);
    }

    EmployeeAlreadyBusyException(String message, Throwable cause) {
        super(message, cause);
    }
}
