package userpkg;
import java.util.ArrayList;
import java.util.Date;
import app.*;

public class Group implements UserMaintainer, TaskMaintainer {
    private static int count = 1; 
    private final int id;
    private String name;
    //@composição
    private ArrayList<User> users;
    private ArrayList<Task> tasks;

    public Group(String name) {
        this.id = Group.count++;
        this.name = name;
        this.users = new ArrayList<User>();
        this.tasks = new ArrayList<Task>();
        TodoListApp.addGroup(this);
    }
    
    // Getters e Setters

    public String getName(){
        return this.name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }

    public int getId(){
        return this.id;
    }
    
    //Implementa os metodos da Interface UserMaintainer 
    
	public void addUser(int userId) {
		User user = null;//TodoListApp.getUser(userId);
		this.users.add(user);
	}
	
	public void addUser(User user) {
		this.users.add(user);
	}
	
	public void showUsers() {
		System.out.println(this.users);
		
	}

	public void removeUser(int userId) {
		User target = null; 
		for (User user : this.users) {
			if(user.getId() == userId) {
				target = user;
			}
		}
		this.users.remove(target);
		
	}
	
	public void removeUser(User user) {
		this.users.remove(user);
		
	}

	public ArrayList<User> getUsers() {
		return this.users;
	}
    
     //Implementa os metodos da Interface TaskMaintainer

	public void createTask(String name) {
		Task task = new Task(name);
		this.addTask(task);
		
	}

	public void createTask(String name, Date date) {
		Task task = new Task(name,date);
		this.addTask(task);
	}

	public void addTask(Task task) {
		this.tasks.add(task);
	}

	public void showTasks() {
		for (Task task : this.tasks) {
			System.out.println(task);
		}
	}

	public void updateTask(int taskId, String name) {
		for (Task task : this.tasks) {
			if(task.getId() == taskId) {
				task.setName(name);
			}
		}
	}

	public void updateTask(int taskId, String name, Date date) {
		for (Task task : this.tasks) {
			if(task.getId() == taskId) {
				task.setName(name);
				task.setDate(date);
			}
		}
	}

	public void deleteTask(int taskId) {
		Task target = null;
		for (Task task : this.tasks) {
			if(task.getId() == taskId) {
				target = task;
			}
		}
		this.tasks.remove(target);
	}
	

	public void removeTask(int taskId) {
		Task target = null;
		for (Task task : this.tasks) {
			if(task.getId() == taskId) {
				target = task;
			}
		}
		this.tasks.remove(target);
	}
	
	public void removeTask(Task task) {
		this.tasks.remove(task);
	}

	public ArrayList<Task> getTasks() {
		return this.tasks;
	}
	
	@Override
	public String toString() {
		return "Group{ name: " + this.getName() + ", id: #" + this.getId() + ", users: " + this.getUsers() + ", tasks: " + this.getTasks() + " }";
	}
}