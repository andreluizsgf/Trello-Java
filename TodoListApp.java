import java.util.ArrayList;

public class TodoListApp{
    private ArrayList<User> users;
    private ArrayList<Admin> admins;
    private ArrayList<Group> groups;

    public TodoListApp(){
        this.users = new ArrayList<User>();
        this.admins = new ArrayList<Admin>();
        this.groups = new ArrayList<Group>();

    }

    public User createUser(String name){
        User joao = new User(name);
        addUser(joao);
        return joao;
    }

    public void addUser(User joao){
        users.add(joao);
    }

    public void addUser(User joao, int user_id){
        users.add(user_id, joao);
    }

    public Group createGroup(String name){
        groups.add(new Group(name));
        return new Group(name);
    }

    public Admin createAdmin(String name){
        //Tem que adicionar na lista de admins, porém dá erro;
        return new Admin(name);
    }

    public Manager createManager(int id, String name, Group group){
        return new Manager(id, name, group);
    }

    public void deleteUser(int user_id){
        User joao = getUser(user_id);
        if(getUser(user_id) instanceof Manager){
            Manager manager = (Manager)joao;
            deleteGroup(manager);
        }
        users.remove(joao);
    }

    public void deleteGroup(Manager manager){
        groups.remove(manager.getGroup());
    }

    public User getUser(int user_id){
        return users.get(user_id - 1);
    }

    public void updateUser(int user_id, String name){

        User joao = getUser(user_id);
        deleteUser(user_id );
        joao.setName(name);
        users.add(user_id - 1, joao);
    }

    public void showUser(int user_id){
        System.out.println(getUser(user_id).getName());
    }

    public void listUsers(){
        for(User user : users){
            System.out.println(user.getId() + " - " + user.getName());
        }
    }

    public void turnManager(Manager manager, int user_id){
        deleteUser(user_id);
        users.add(user_id - 1, manager);
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
            System.out.println(group.getID() + " - " + group.getName());
        }
    } 
}