
public class Manager extends User{
    
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
        this.group.addTask(new Task(name));
    }

    public void listUsers(){
        this.group.listUsers();
    }

    public void listTasks(){
        this.group.listTasks();
    }
}