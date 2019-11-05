import java.util.ArrayList;

public class TodoListApp{
    private ArrayList<Person> users;
    private ArrayList<Task> tasks;
    private ArrayList<Group> groups;

    public TodoListApp(){
        this.users = new ArrayList<Person>();
        this.tasks = new ArrayList<Task>();
        this.groups = new ArrayList<Group>();

    }

    public void createUser(String name){
        users.add(new User(name));
    }

    public void deleteUser(int user_id){
        users.remove(user_id);
    }

    public void updateUser(int user_id, String name){
        User joao = (User)users.get(user_id);
        joao.setName(name);
        users.add(user_id, joao);
    }

    public void showUser(int user_id){
        System.out.println(users.get(user_id).getName());
    }

    public void listUsers(){
        for(Person user : users){
            System.out.println(user.getName());
        }
    }

    public void listAdmins(){
        for(Person user : users){
            if(user instanceof Admin)
                System.out.println(user.getName());
        }
    }

    public void listManagers(){
        for(Person user : users){
            if(user instanceof Manager)
                System.out.println(user.getName());
        }    
    }

    public void listGroups(){
        for(Group group : groups){
            System.out.println(group.getName());
        }
    } 
}