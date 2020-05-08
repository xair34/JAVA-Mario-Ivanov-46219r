package BorderControl;

public class Person implements Identifieable {
    private String Name;
    private int Age;
    private String Id;

    @Override
    public String getId() {
        return this.Id;
    }

    public int getAge() {
        return Age;
    }
    public String getName(){
        return Name;
    }
    Person(String name, int age, String id){
        this.Age = age;
        this.Name = name;
        this.Id = id;
    }
}
