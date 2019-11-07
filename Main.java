public class Main{

    public static void main(String args[]) {
        TodoListApp todo = new TodoListApp();
        Admin oioi = todo.createAdmin("oioi");
        //Admin oioi = new Admin("oioi");
        //User joao = new User("joao");
        oioi.createUser("kaka", todo);
        oioi.createUser("kaka", todo);
        oioi.updateUser(1, "caio", todo);
        //joao.getName();
        //oioi.deleteUser(1, todo);
        oioi.listUsers(todo);
        oioi.showUser(1,todo);
        oioi.listAdmins(todo);
        oioi.listGroups(todo);
    }
}