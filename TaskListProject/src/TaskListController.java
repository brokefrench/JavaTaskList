import java.time.LocalDateTime;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TaskListController {

    private SortedSet<Task> taskList = new TreeSet<Task>(
            (Task t1, Task t2) -> t1.getCreationDate().compareTo(t2.getCreationDate())
    );

    public TaskListController() {
    }

    public SortedSet<Task> getTaskList() {
        return (SortedSet<Task>)Set.copyOf(taskList);
    }

    public Task newTask(String s, boolean b, LocalDateTime time){
        Task t = newTask(s, b, time);
        taskList.add(t);
        return t;
    }
}
