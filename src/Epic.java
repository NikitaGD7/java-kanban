import java.util.ArrayList;
import java.util.List;
public class Epic extends Task {
    private List<SubTask> subTasks;
    private Epic epic;
    public Epic(String name, String description) {
        super(name, description);
        subTasks = new ArrayList<>();
    }

    public List<SubTask> getSubtasks() {
        return subTasks;
    }

    public void addSubtask(SubTask subtask) {
        subTasks.add(subtask);
    }
}
