import java.util.Arraylist;

public class Admin extends Pessoa{

    private int is_Admin;

    public Admin(String name){
        super(name);
        is_Admin = 1;
    }

    public void indexUsers(TodoListApp todo){
        todo.listUsers();
    }

    public void indexManagers(TodoListApp todo){
        todo.listManagers();
    }

    public void indexAdmins(TodoListApp todo){
        todo.listAdmins();
    }

    public void indexGroups(TodoListApp todo){
        todo.listGroups;
    }

    public void createUser(String name){
        users.add(new User(name));
    }

    public void deleteUser(int user_id){
        users.remove(user_id);
    }

    public void updateUser(int user_id, String name){
        users.add(user_id, users.get(user_id).setName(name));
    }

    public void showUser(int user_id){
        System.out.println(user.get(user_id).getName());
    }


}