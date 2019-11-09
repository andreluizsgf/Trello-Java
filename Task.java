import java.util.Date;

class Task {
    private static int count = 0; 
    private final int id;
    private String name;
    private Date date;
    private boolean isDone; 

    public Task(String name) {
        this.id = this.count++;
        this.name = name;
        this.isDone = false;
    }

    public Task(String name, Date date) {
        this.id = this.count++;
        this.name = name;
        this.isDone = false;
        this.date = date;
    }

    public String getName() {
        return this.name;
    }

    public int getID(){
        return this.id;
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
}