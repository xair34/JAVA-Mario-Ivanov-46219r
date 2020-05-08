public class Tomcat extends Cat{
    public Tomcat(String name, int age, String gender) {
        super(name, age, gender);
    }
    private void validateGender() {
        if (!(super.gender.equals("Male"))) {
            throw new IllegalArgumentException("Invalid input!");
        }
    }

    public void ProduceSound(){
        System.out.println("MEOW");
    }
}
