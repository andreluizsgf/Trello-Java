import java.util.*;

class Task {
    private static int count = 0; 
    private final int id;
    private String name;
    private Data date;
    private boolean isDone; 

    public Task(String name) {
        this.name = name;
        this.isDone = false;
    }

    public Task(String name, Date date) {
        this.name = name;
        this.isDone = false;
        this.date = date;
    }

    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        this.name = name;
    }

    public void markAsDone() {
        this.isDone = true;
    }
}