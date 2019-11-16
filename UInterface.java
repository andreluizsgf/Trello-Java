import java.util.Date;

public interface UInterface {

    void createTask(String name, Date date);
    void deleteTask(int task_index);
    void showTask(int task_index);
    void updateTask(int task_index, String name);
    void updateTask(int task_index, String name, Date date);

    

}