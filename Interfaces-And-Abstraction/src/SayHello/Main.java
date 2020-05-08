package SayHello;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Person> persons = new ArrayList<>();
        persons.add(new Bulgarian("Bulgarian Tylyp"));
        persons.add(new European("Euro Tylyp"));
        persons.add(new Chinese("Chinese Tylyp"));

        for (Person person : persons) {
            System.out.println(person.sayHello());
        }
    }
}
