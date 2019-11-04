public class TodoListApp{
    private ArrayList<User> users;
    private ArrayList<Task> tasks;

    public TodoListApp(){
        this.users = new ArrayList<User>();
        this.users = new ArrayList<Task>();
    }

    public indexUsers(){
        for(User user : users){
            System.out.println(users.getName());
        }
    }
}