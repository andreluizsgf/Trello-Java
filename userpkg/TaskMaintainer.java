package userpkg;

import java.util.Date;
import java.util.ArrayList;
import app.Task;

//@Interface
public interface TaskMaintainer {

	void createTask(String name);
	void createTask(String name, Date date);
	void addTask(Task task);
	
	void showTasks();
	
	void updateTask(int taskId, String name);
	void updateTask(int taskId, String name, Date date);
	
	void removeTask(int taskId);
	void removeTask(Task task);
	
	ArrayList<Task> getTasks();
}
