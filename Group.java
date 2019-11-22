import java.util.ArrayList;
import java.util.Date;

class Group {
    private static int count = 0; 
    private final int id;
    private String name;
    private ArrayList<User> users;
    private ArrayList<Task> tasks;

    public Group(String name) {
        this.id = this.count++;
        this.name = name;
        this.users = new ArrayList<User>();
        this.tasks = new ArrayList<Task>();
    }

    public String getName(){
        return this.name;
    }

    public int getID(){
        return this.id;
    }

    public void addMember(User member) {
        this.users.add(member);
    }

    public void showUsers() {
        System.out.println(this.users);
    }

    public void removeMember(User member) {
        this.users.remove(member);
    }

    public void createTask(Task task) {
        this.tasks.add(task);
    }

    public void listUsers() {
        for(User user : users){
            System.out.println(user.getId() + " - " + user.getName());
        }
    }

    public void listTasks() {
        for(Task task : tasks)
            task.showTask();
    }

    public void createTask(String name, Date date) {
        Task task = new Task(name, date);
        this.tasks.add(task);
    }

    public void deleteTask(int task_index) {
        this.tasks.remove(task_index - 1);
    }

    public void showTask(int task_index) {
        this.tasks.get(task_index-1).showTask();
    }

    public void updateTask(int task_index, String name) {
        this.tasks.get(task_index - 1).setName(name);
    }
}