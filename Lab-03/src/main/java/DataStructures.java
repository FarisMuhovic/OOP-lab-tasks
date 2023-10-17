import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataStructures {
    private List<TaskItem> tasks = new ArrayList<>();

    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1,"Push lab code to the github" ,taskStatus.TO_DO),
                new TaskItem(2,"Prepare for the quiz", taskStatus.IN_PROGRESS),
                new TaskItem(3,"Go over tasks from lab2", taskStatus.COMPLETED));
    }
    // TODO create a method to get all objects
    public List<TaskItem> getAllObj() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("The id is " + tasks.get(i).getTaskId() + " " + "The description is: " +
                    tasks.get(i).getTaskDescription() + " " + "Task status: " + tasks.get(i).getTaskStatus());
        }
        return tasks;
    }
    // Method to print all items
    public void  printObj(List<TaskItem> tasksp) {
        for (int i = 0; i < tasksp.size(); i++) {
            System.out.println("The id is " + tasksp.get(i).getTaskId() + " " + "The description is: " +
                    tasksp.get(i).getTaskDescription() + " " + "Task status: " + tasksp.get(i).getTaskStatus());
        }
    }
    // TODO create a method getByStatus that will accept a Status parameter and filter the tasks with the provided status
    public  List<TaskItem> filterStatus(taskStatus status) {
        List<TaskItem> filteredlist = new ArrayList<>();
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getTaskStatus().equals((status))) {
                filteredlist.add(tasks.get(i));
            }
        }
        return filteredlist;
    }
    public  List<TaskItem> filterId(int id ) {
        List<TaskItem> filteredlist = new ArrayList<>();
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getTaskId() >= id) {
                filteredlist.add(tasks.get(i));
            }
        }
        return filteredlist;
    }
    public void printDescription() {
        tasks.stream().forEach((n) -> System.out.println(n.getTaskDescription()));
    }
}
