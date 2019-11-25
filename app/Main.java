package app;

import java.util.InputMismatchException;
import java.util.Scanner;
import userpkg.*;

public class Main{

    public static void main(String args[]) {
    	
    	int n = 0;
    	System.out.println("Digite o n�mero de admin que desejas criar:");
		Scanner sc = new Scanner(System.in);
    	try {
            n = sc.nextInt();
            if(n < 0) {
            	//@Tratamento de Exce��o
            	throw new InputMismatchException("O n�mero n�o pode ser negativo.");
            }
    	} catch (InputMismatchException ex) {
    		String message = ex.getMessage();
    		if(message != null) {
    			System.out.println(message);
    		}
            System.out.println("Entrada Inv�lida. O valor deve ser um n�mero inteiro positivo. Nenhum Admin criado.");
        }
    	sc.nextLine();
    	
    	for (int i = 0; i < n; i++) {
    		System.out.println("Digite o nome do " + (i+1) +"� Admin:");
    		String adminName = sc.nextLine();
    		new Admin(adminName);
		}
    	
		User vinicius = new User("vinicius");
		Manager bia = new Manager("bia", new Group("POO - 2019.2"));
		Group APC = new Group("Apaixonados por Cinema <3");
		Manager mariana = new Manager("mariana", APC);
		bia.addInGroup(vinicius);
		APC.addUser(bia);
		Admin rogerio = new Admin("rogerio");
		
		System.out.println("---------");
		TodoListApp.log();
		System.out.println("---------");
		
		rogerio.removeUser(bia);
		Task fazerCafe = new Task("Fazer caf�");
		vinicius.addTask(fazerCafe);
		mariana.addInGroup(vinicius.getId());
		fazerCafe.markAsDone();
		//rogerio.deleteGroup(APC);
		//rogerio.removeUser(mariana);
		//mariana.deleteGroup();
		
		System.out.println("---------");
		TodoListApp.log();
		System.out.println("---------");
		
       
        
    }
}