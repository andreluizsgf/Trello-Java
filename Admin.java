import java.util.ArrayList;

public class Admin extends Person{

    private int is_Admin;

    public Admin(String name){
        super(name);
        is_Admin = 1;
    }

    public void listUsers(TodoListApp todo){
        todo.listUsers();
    }

    public void listManagers(TodoListApp todo){
        todo.listManagers();
    }

    public void listAdmins(TodoListApp todo){
        todo.listAdmins();
    }

    public void listGroups(TodoListApp todo){
        todo.listGroups();
    }

    public void createUser(String name, TodoListApp todo){
        todo.createUser(name);
    }

    public void deleteUser(int user_id, TodoListApp todo){
        todo.deleteUser(user_id);
    }

    public void updateUser(int user_id, String name, TodoListApp todo){
        todo.updateUser(user_id, name);
    }

    public void showUser(int user_id, TodoListApp todo){
        todo.showUser(user_id);
    }


}