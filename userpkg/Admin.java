package userpkg;

import java.util.Date;
import java.util.ArrayList;
import app.*;

public class Admin extends Person implements UserMaintainer {

    public Admin(String name){
        super(name);
        TodoListApp.addAdmin(this);
    }
    
	public void presentation() {
		System.out.println("Admin{ name:" + this.getName() + "(#" + this.getId() + ") }");		
	}
    
    //
    
    public void createTaskIn(TaskMaintainer taskMaintainer, String name) {
    	taskMaintainer.createTask(name);
    }
    
    public void createTaskIn(TaskMaintainer taskMaintainer, String name, Date date) {
    	taskMaintainer.createTask(name, date);
    }
    
    public void addTaskIn(TaskMaintainer taskMaintainer, Task task) {
    	taskMaintainer.addTask(task);
    }
	
	//Implementa os metodos da interface UserMaintainer
    
    public void addUser(int userId) {
		TodoListApp.addUser(userId);
	}

	public void addUser(User user) {
		TodoListApp.addUser(user);
	}

	public void showUsers() {
		TodoListApp.showUsers();
		
	}

	public void removeUser(int userId) {
		TodoListApp.removeUser(this, userId);
		
	}

	public void removeUser(User user) {
		TodoListApp.removeUser(this, user);
		
	}

	public ArrayList<User> getUsers() {
		return TodoListApp.getUsers(this);
	}
	
	//
	
	public void deleteGroup(int groupId) {
		TodoListApp.deleteGroup(this, groupId);
	}
	
	public void deleteGroup(Group group) {
		TodoListApp.deleteGroup(this, group);
	}
	
	@Override
	public String toString() {
		return "Admin" + super.toString() + " }";
	}
}