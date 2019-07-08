package task;

public class TaskAlreadyAssignedException extends RuntimeException {
    public TaskAlreadyAssignedException(String message) {
        super(message);
    }

    TaskAlreadyAssignedException(String message, Throwable cause) {
        super(message, cause);
    }
}
