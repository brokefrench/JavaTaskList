import java.time.LocalDateTime;

public class Task {

    private String taskName;
    private boolean isDone;
    private LocalDateTime creationDate;

    public Task(String taskName, boolean isDone) {
        this.taskName = taskName;
        this.isDone = isDone;
        this.creationDate = LocalDateTime.now();
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }
}
