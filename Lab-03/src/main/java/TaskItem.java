public class TaskItem {
    private int taskId;
    private String taskDescription;
    taskStatus taskStatus;

    public TaskItem(int id, String desc, taskStatus status){
        this.taskId = id;
        this.taskDescription = desc;
        this.taskStatus = status;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public taskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(taskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }


}
