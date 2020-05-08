package person;

public class Child {
    private String Name;
    private int Age;

    public String getName(){
        return this.Name;
    }
    public int getAge(){
        return this.Age;
    }
    public Child(String name, int age){
        this.Name = name;
        this.Age = age;
    }
}
