package userpkg;

import app.TodoListApp;

public class Manager extends User {
    
    private Group group;
    
    public Manager(String name){
        super(name);
    }
    
    public Manager(String name, Group group){
        super(name);
        this.group = group;
        if(this.group != null) {
        	this.group.addUser(this);
        }
    }
    
    public Manager(int id, String name, Group group){
        super(id, name);
        this.group = group;
        if(this.group != null) {
        	this.group.addUser(this);
        }
    }
    
    @Override
    //@Sobreposição
    public void presentation() {
    	int tasksAmount = this.getTasks().size() + this.group.getTasks().size();
    	String presentation = "Manager{ name: " + this.getName() + "(#"+ this.getId() +")" + ", tasks:  Tasks[" + tasksAmount + "] }";
    	System.out.println(presentation);
    }
    
    //Getters e Setters

    public Group getGroup(){
        return this.group;
    }
    
    public void setGroup(Group  group) {
    	this.group = group;
    }
    
    //Metodos para manipular o grupo atráves do Manager
    
    public void addInGroup(int userId){
    	this.group.addUser(userId);   
    }
    
    public void addInGroup(User user){
    	this.group.addUser(user);   
    }

    public void removefromGroup(int userId){
    	this.group.removeUser(userId);
    }
    
    public void removefromGroup(User user){
    	this.group.removeUser(user);
    }

    public void showGroupUsers(){
        this.group.showUsers();
    }
    
    /**
     * Destroi o grupo do Manager, por consequência o Manager é destruido e a função retorna um User com os dados do Manager
     * 
     * @return user
     */

    public User deleteGroup(){
        TodoListApp.deleteGroup(this, this.group);
    	System.gc();
    	User user = (User)this;
        return user;
    }
    
    @Override
	public String toString() {
		return "Manager{ name: " + this.getName() + ", id: #" + this.getId() +", tasks: " + this.getTasks() + ", group: #" + this.getGroup().getId() + " }";
	}


}