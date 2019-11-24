package app;

import userpkg.*;

public class Main{

    public static void main(String args[]) {
    	
		User vinicius = new User("vinicius");
		Manager bia = new Manager("bia", new Group("POO - 2019.2"));
		Group APC = new Group("Apaixonados por Cinema <3");
		Manager mariana = new Manager("mariana", APC);
		bia.addInGroup(vinicius);
		Admin rogerio = new Admin("rogerio");
		
		System.out.println("---------");
		TodoListApp.log();
		System.out.println("---------");
		
		rogerio.removeUser(bia);
		//rogerio.deleteGroup(APC);
		mariana.deleteGroup();
		
		//System.out.println(vinicius);
		System.out.println("---------");
		TodoListApp.log();
		System.out.println("---------");
		
       
        
    }
}