class TaskAlreadyAssignedException extends RuntimeException {
    TaskAlreadyAssignedException(String message) {
        super(message);
    }

    TaskAlreadyAssignedException(String message, Throwable cause) {
        super(message, cause);
    }
}
