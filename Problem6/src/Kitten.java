public class Kitten extends Cat{
    public Kitten(String name, int age, String gender) {
        super(name, age, gender);
    }
    private void validateGender() {
        if (!(super.gender.equals("Female"))) {
            throw new IllegalArgumentException("Invalid input!");
        }
    }

    public void ProduceSound(){
        System.out.println("Meow");
    }
}
