package app;

public abstract class Person {
    private static int count = 0; 
    private final int id;
    private String name;

    public Pessoa(name) {
        this.id = this.count++;
        this.name = name;

    }

    public String getName(){
        return this.name;
    }

    public setName(String name){
        this.name = name;
    }

    public abstract coco();
}