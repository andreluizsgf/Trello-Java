import java.util.Date;

public class Main{

    public static void main(String args[]) {
        TodoListApp todo = new TodoListApp();
        Admin oioi = todo.createAdmin("oioi"); //Cria admin
        User kaka = oioi.createUser("kaka", todo); //Criar usuário
        User joao = oioi.createUser("joao", todo);
        Manager man = kaka.createGroup("grupao", todo); //Cria grupo
        man.addInGroup(2, todo);
        man.addInGroup(1, todo);
        man.removefromGroup(1, todo);
        man.listUsers();
        man.createTask("lavar o tênis", new Date());
        //man.deleteTask(1);
        man.updateTask(1, "lavar");
        man.listTasks();
        //todo.turnManager(caco, 1);
        //oioi.updateUser(1, "caio", todo); //Atualiza nome de usuario de id 1;
        //oioi.showUser(1,todo); //Mostra usuário de id 1;
        //oioi.listUsers(todo);   //Lista todos os usuários no sistema;
        //oioi.listAdmins(todo);  //Lista todos os admins no sistema;
        //oioi.listGroups(todo);  //Lista todos os grupos no sistema;
    }
}