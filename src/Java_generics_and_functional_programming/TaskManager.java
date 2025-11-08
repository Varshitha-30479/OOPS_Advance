package Java_generics_and_functional_programming;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Task {
    private String title;
    private String priority;
    private LocalDate dueDate;

    public Task(String title, String priority, LocalDate dueDate) {
        this.title = title;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    public String getTitle() {
        return title;
    }

    public String getPriority() {
        return priority;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }
}

public class TaskManager {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task("Complete Project Report", "High", LocalDate.of(2025, 2, 10)));
        tasks.add(new Task("Attend Meeting", "Medium", LocalDate.of(2025, 2, 5)));
        tasks.add(new Task("Fix Bugs", "High", LocalDate.of(2025, 1, 30)));
        tasks.add(new Task("Prepare Slides", "Low", LocalDate.of(2025, 2, 15)));
        tasks.add(new Task("Submit Assignment", "High", LocalDate.of(2025, 2, 1)));

        // Stream API: Filter high priority tasks, map to titles, collect to list
        List<String> highPriorityTaskTitles = tasks.stream()
                .filter(task -> task.getPriority().equalsIgnoreCase("High"))
                .map(Task::getTitle)
                .collect(Collectors.toList());

        // Display using forEach()
        System.out.println("High Priority Tasks:");
        highPriorityTaskTitles.forEach(System.out::println);
    }
}
