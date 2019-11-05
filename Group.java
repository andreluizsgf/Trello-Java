import java.util.ArrayList;

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

    public void addMember(User member) {
        this.users.add(member);
    }

    public void showUsers() {
        System.out.println(this.users);
    }

    public void removeMember(User member) {
        this.users.remove(member);
    }
    /**
    imcompletoo
     */
    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public void showTasks() {
        System.out.println(this.tasks);
    }
}