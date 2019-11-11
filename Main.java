public class Main{

    public static void main(String args[]) {
        TodoListApp todo = new TodoListApp();
        Admin oioi = todo.createAdmin("oioi"); //Cria admin
        User kaka = oioi.createUser("kaka", todo); //Criar usuário
        kaka.createGroup("grupao", todo); //Cria grupo
        //Group group = new Group("grupao");
        //Manager caco = todo.createManager("joao", group);
        //todo.turnManager(caco, 1);
        //oioi.updateUser(1, "caio", todo); //Atualiza nome de usuario de id 1;
        //oioi.showUser(1,todo); //Mostra usuário de id 1;
        oioi.listUsers(todo);   //Lista todos os usuários no sistema;
        //oioi.listAdmins(todo);  //Lista todos os admins no sistema;
        oioi.listGroups(todo);  //Lista todos os grupos no sistema;
    }
}