public abstract class Person{

    private static int count = 0; 
    private final int id;
    private String name;

    public Person(String name) {
        this.id = this.count++;
        this.name = name;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }
    
    public void setName(String name){
        this.name = name;
    }
}