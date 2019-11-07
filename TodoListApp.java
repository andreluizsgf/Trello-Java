import java.util.ArrayList;

public class TodoListApp{
    private ArrayList<User> users;
    private ArrayList<Admin> admins;
    private ArrayList<Task> tasks;
    private ArrayList<Group> groups;

    public TodoListApp(){
        this.users = new ArrayList<User>();
        this.tasks = new ArrayList<Task>();
        this.groups = new ArrayList<Group>();

    }

    public void createUser(String name){
        //User joao = new User(name);
        users.add(new User(name));
    }

    public void addAdmin(Admin joao){
        admins.add(joao);
    }

    public Admin createAdmin(String name){
        Admin joao = new Admin(name);
        //addAdmin(joao);
        return joao;
    }

    public void deleteUser(int user_id){
        users.remove(users.get(user_id - 1));
    }

    public void updateUser(int user_id, String name){

        User joao = users.get(user_id - 1);
        deleteUser(user_id );
        joao.setName(name);
        users.add(user_id - 1, joao);
    }

    public void showUser(int user_id){
        System.out.println(users.get(user_id - 1).getName());
    }

    public void listUsers(){
        for(Person user : users){
            System.out.println(user.getId() + " - " + user.getName());
        }
    }

    public void listAdmins(){
        for(Person user : users){
            if(user instanceof Admin)
                System.out.println(user.getName());
        }
    }

    /*public void listManagers(){
        for(Person user : users){
            if(user instanceof Manager)
                System.out.println(user.getName());
        }    
    }*/

    public void listGroups(){
        for(Group group : groups){
            System.out.println(group.getName());
        }
    } 
}