package userpkg;

import java.util.ArrayList;
import java.util.Date;

import app.*;

//@Herança
public class User extends Person implements TaskMaintainer {
	//@Composição
    private ArrayList<Task> tasks;

    public User(String name){
        super(name);
        this.tasks = new ArrayList<Task>();
        TodoListApp.addUser(this);
    }

    public User(int id, String name){
        super(id, name);
        this.tasks = new ArrayList<Task>();
        TodoListApp.addUser(this);
    }
    
    public void presentation() {
    	String presentation = "User{ name: " + this.getName() + "(#"+ this.getId() +")" + ", tasks:  Tasks[" + this.tasks.size() + "] }";
    	System.out.println(presentation);
    }

	public void createTask(String name) {
		Task task = new Task(name);
		this.addTask(task);
		
	}
	
	public void setTasks(ArrayList<Task> tasks) {
		this.tasks = tasks;
	}
	
	public ArrayList<Task> getTasks() {
		return this.tasks;
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
    
//    public Manager createGroup(String name, TodoListApp todo){
//        Manager joao = todo.createManager(this.getId(), this.getName(), todo.createGroup(name));
//        todo.addUser(joao, this.getId());
//        return joao;  
//    }
	
	@Override
	public String toString() {
		return "User" + super.toString() + ", tasks: " + this.getTasks() + " }";
	}

}