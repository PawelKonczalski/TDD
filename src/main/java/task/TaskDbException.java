package task;

public class TaskDbException extends RuntimeException {

    public TaskDbException(String massage){
        super(massage);
    }

    TaskDbException(String massage, Throwable couse){
        super(massage, couse);
    }
}
