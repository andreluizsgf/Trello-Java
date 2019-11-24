package app;

import java.util.ArrayList;
import userpkg.*;

public abstract class TodoListApp {
	//@Campos estáticos
    private static ArrayList<User> users = new ArrayList<User>();
    private static ArrayList<Admin> admins = new ArrayList<Admin>();
    private static ArrayList<Group> groups = new ArrayList<Group>();
    private static String ERROR_STR = "Acess Denied";
    
    public enum Permition {
    	ADMIN,
    	MANAGER,
    	ADMIN_OR_MANAGER,
    	USER
    }

    //@Instanceof
    private static boolean hasPermission(Person person, Permition requiredPermition) {
    	boolean hasPermition = false;
    	switch (requiredPermition) {
			case ADMIN:
				hasPermition = person instanceof Admin; 
				break;
			case MANAGER:
				hasPermition = person instanceof Manager;
				break;
			case ADMIN_OR_MANAGER:
				hasPermition = person instanceof Admin || person instanceof Manager;
				break;
			case USER:
				hasPermition = person instanceof User;
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + requiredPermition);
		}
    	return hasPermition;
    }
    
    private static User getUser(int userId) {
    	User target = null;
		for (User user : TodoListApp.users) {
			if(user.getId() == userId) {
				target = user;
			}
		}
		return target;
    }
    
    public static User getUser(Person admin, int userId) {
    	if(TodoListApp.hasPermission(admin, Permition.ADMIN)) {
    		return TodoListApp.getUser(userId);
    	}else {
    		return null;
    	}
    }
    
    public static ArrayList<User> getUsers(Person admin) {
    	if(TodoListApp.hasPermission(admin, Permition.ADMIN)) {
    		return TodoListApp.users;
    	}else {
    		return null;
    	}
    }
    
    //@Sobrecarga
	public static void addUser(int userId) {
		User user = TodoListApp.getUser(userId);
		TodoListApp.addUser(user);
	}
	//@Sobrecarga
	public static void addUser(User user) {
		TodoListApp.users.add(user);
	}

	public static void showUsers() {
		System.out.println(TodoListApp.users);
	}
	
	public static void showUsers(boolean compact) {
		if(compact) {
			for (User user : TodoListApp.users) {
				//@Polimorfismo
				//@Ligação dinamica
				user.presentation();
			}
		}else {			
			System.out.println(TodoListApp.users);
		}
		
	}

	public static void removeUser(Person admin, int userId) {
		User user = TodoListApp.getUser(userId);
		TodoListApp.removeUser(admin, user);
	}

	public static void removeUser(Person admin, User user) {
		if(TodoListApp.hasPermission(admin, Permition.ADMIN)) {
			TodoListApp.users.remove(user);
			if(user instanceof Manager) {
				//@Casting
				TodoListApp.deleteGroup(user, ((Manager) user).getGroup());
			}
		}else {
			System.out.println(TodoListApp.ERROR_STR);
		}
	}
	
	private static Group getGroup(int groupId) {
    	Group target = null;
		for (Group group : TodoListApp.groups) {
			if(group.getId() == groupId) {
				target = group;
			}
		}
		return target;
    }
	
	public static void addGroup(Group group) {
		TodoListApp.groups.add(group);
	}
	
	public static void showGroups() {
		System.out.println(TodoListApp.groups);
	}
	
	public static void deleteGroup(Person person, int groupId) {
		Group group = TodoListApp.getGroup(groupId);
		TodoListApp.deleteGroup(person, group);
	}
	
	public static void deleteGroup(Person person, Group group) {
		if(TodoListApp.hasPermission(person, Permition.ADMIN_OR_MANAGER)) {
			TodoListApp.groups.remove(group);
		}else {
			System.out.println(TodoListApp.ERROR_STR);
		}
	}
	
	public static void addAdmin(Admin admin) {
		TodoListApp.admins.add(admin);
	}
	
	public static void showAdmins() {
		System.out.println(TodoListApp.admins);
	}
	
	public static void log() {
		TodoListApp.showAdmins();
		TodoListApp.showGroups();
		TodoListApp.showUsers(true);
	}

//	public static ArrayList<User> getUsers() {
//		// TODO Auto-generated method stub
//		return null;
//	}
    
}