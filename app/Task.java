package app;
import java.util.Date;

public class Task {
    private static int count = 0; 
    private final int id;
    private String name;
    private Date date;
    private boolean isDone; 

    public Task(String name) {
        this.id = Task.count;
        this.name = name;
        this.isDone = false;
    }

    public Task(String name, Date date) {
        this.id = Task.count++;
        this.name = name;
        this.isDone = false;
        this.date = date;
    }

    public String getName() {
        return this.name;
    }

    public int getId(){
        return this.id+1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate(){
        return this.date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public void markAsDone() {
        this.isDone = true;
    }

    public void showTask(){
    	String isMarked = " ";
    	if(this.isDone) {
    		isMarked = "x";
    	}
        System.out.println("#" + this.getId() + "[" + isMarked + "] - " + this.getName() + " - " + this.getDate());
    }
}