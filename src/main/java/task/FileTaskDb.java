package task;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Collections.singletonList;

public class FileTaskDb implements TaskDB {
    private final Path path;
    private final Charset charset;

    public FileTaskDb(Path path, Charset charset) {
        this.path = path;
        this.charset = charset;
    }

    private static Task apply(String s) {
        String[] taskData = s.split(",");
        return new Task(taskData[0]);
    }

    @Override
    public long add(Task task) {
        try {
            long id = Files.readAllLines(path).size();
            Task taskCopy = new Task(task.getTitle());
            Files.write(path, singletonList(taskCopy.asLine()), charset);
            return id;
        } catch (IOException e){
            throw new TaskDbException(String.format("fail to add new task %s", task), e);
        }
    }

    @Override
    public Iterable<Task> findAll() throws TaskDbException {
        try {
            return Files.lines(path, charset).map(FileTaskDb::apply).collect(Collectors.toList());
        } catch (IOException e) {
            throw new TaskDbException("Can not find task", e);
        }
    }

    @Override
    public Optional<Task> findById(long id) throws TaskDbException {
        return Optional.empty();
    }
}
