package task;

import java.util.Optional;

public interface TaskDB {
	long add(Task task) throws TaskDbException;

	Iterable<Task> findAll() throws TaskDbException;

	Optional<Task> findById(long id) throws TaskDbException;
}
