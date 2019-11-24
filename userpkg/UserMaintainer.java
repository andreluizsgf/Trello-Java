package userpkg;

import java.util.ArrayList;

//@Interface
public interface UserMaintainer {
	void addUser(int userId);
	void addUser(User user);
	
	void showUsers();
	
	void removeUser(int userId);
	void removeUser(User user);
	
	ArrayList<User> getUsers();
}
