import java.util.ArrayList;
import java.util.List;

public class TaskTracker {
    private List<Task> tasks;

    public void TaskTracker() {

        this.tasks = new ArrayList<>();
    }

    public List<Task> getAllTasks() {

        return tasks;
    }

    public void deleteAllTasks() {

        tasks.clear();
    }

    public Task getTaskById(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    public void createTask(Task task) {
        int newId = generateNewId();
        task.setId(newId);
        tasks.add(task);
    }

    public void updateTask(Task updatedTask) {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            if (task.getId() == updatedTask.getId()) {
                tasks.set(i, updatedTask);
                break;
            }
        }
    }

    public void removeTaskById(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            if (task.getId() == id) {
                tasks.remove(i);
                break;
            }
        }
    }

    public List<SubTask> getSubtasksByEpic(Epic epic) {
        List<SubTask> subTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task instanceof SubTask) {
                SubTask subTask = (SubTask) task;
                if (subTask.getEpic() == epic) {
                    subTasks.add(subTask);
                }
            }
        }
        return subTasks;
    }
    private int generateNewId() {
        int maxId = 0;
        for (Task task : tasks) {
            if (task.getId() > maxId) {
                maxId = task.getId();
            }
        }
        return maxId + 1;
    }
}


