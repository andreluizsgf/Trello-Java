import java.util.*; 

package app;

class User extends Person {
    private Arraylist<Task> tasks;

    public User(String name){
        super(name);
        this.task = new Arraylist<Task>();
    }

    public showTasks() {
        System.out.println(this.tasks);
    }

    public void createTask(String name, Date date) {
        Task task = new Task(name, date);
        this.tasks.add(task);
    }

    public void deleteTask(int task_index) {
        this.tasks.remove(task_index);
    }

    public void showTask(int task_index) {
        System.out.println(this.tasks.get(task_index))
    }

    public void updateTask(int task_index, String name) {
        this.tasks.get(task_index).setName(name);
    }

    public void updateTask(int task_index, String name, Date date) {
        this.updateTask(task_index, name);
        this.tasks.get(task_index).setDate(date);
    }

}