package userpkg;

//@abstract

public abstract class Person {

    private static int count = 1; 
    private final int id;
    private String name;

    public Person(String name) {
        this.id = Person.count++;
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
    
    public abstract void presentation();
    
    @Override
    public String toString() {
    	return "{ name: " + this.getName() + ", id: #" + this.getId();
    }
}