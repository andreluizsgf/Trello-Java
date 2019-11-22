import java.util.Date;

public class Manager extends User implements UInterface{
    
    private Group group;
    
    public Manager(int id, String name, Group group){
        super(id, name);
        this.group = group;
    }

    public Group getGroup(){
        return this.group;
    }

    public void setGroup(Group group){
        this.group = group;
    }
    
    public void addInGroup(int user_id, TodoListApp todo){
        User joao = todo.getUser(user_id);
        if(!(joao instanceof Manager))
            this.group.addMember(joao);
    }

    public void removefromGroup(int user_id, TodoListApp todo){
        User joao = todo.getUser(user_id);
        if(!(joao instanceof Manager))
            this.group.removeMember(joao);
    }

    public void addTask(String name){
        this.group.createTask(new Task(name));
    }

    public void listUsers(){
        this.group.listUsers();
    }

    public void listTasks(){
        this.group.listTasks();
    }

    public void createTask(String name, Date date) {
        this.group.createTask(name, date);
    }

    public void deleteTask(int task_index) {
        this.group.deleteTask(task_index);
    }

    public void destroyGroup(TodoListApp todo){
        User joao = todo.getUser(super.getId());
        joao.setManage(false);
        todo.deleteUser(super.getId());
    }

    public void showTask(int task_index) {
        this.group.showTask(task_index);
    }

    public void updateTask(int task_index, String name) {
        this.group.updateTask(task_index, name);
    }
}