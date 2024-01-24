import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaskTracker tracker = new TaskTracker();

        // Создание задач
        Task task1 = new Task("Задача 1", "Описание задачи 1");
        Task task2 = new Task("Задача 2", "Описание задачи 2");
        Epic epic1 = new Epic("Эпик 1", "Описание эпика 1");
        SubTask subTask1 = new SubTask("Подзадача 1", "Описание подзадачи 1");

        // Добавление задач в менеджер
        tracker.createTask(task1);
        tracker.createTask(task2);
        tracker.createTask(epic1);
        tracker.createTask(subTask1);

        // Обновление задачи
        task1.setStatus(TaskStatus.IN_PROGRESS);
        tracker.updateTask(task1);

        // Получение списка задач
        List<Task> allTasks = tracker.getAllTasks();
        for (Task task : allTasks) {
            System.out.println(task.getName());
        }
    }
}
