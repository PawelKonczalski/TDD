import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

class TaskDB {

	private Collection<Task> tasks;

	TaskDB() {
		tasks = new ArrayList<>();
	}

	long add(Task task) {
		long id = generateId();
		Task taskCopy = new Task(task, id);
		tasks.add(taskCopy);
		return id;
	}

	Iterable<Task> findAll() {
		return tasks;
	}

	Optional<Task> findById(long id) {
		return tasks.stream().filter(task -> task.getId() == id)
			.findAny();
	}

	private long generateId() {
		return tasks.size() + 1;
	}
}
