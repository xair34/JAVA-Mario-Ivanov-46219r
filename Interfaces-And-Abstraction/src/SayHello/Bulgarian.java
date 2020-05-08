package SayHello;

public final class Bulgarian implements Person {

    private final String name;

    public Bulgarian(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return this.name + " Каза: Здравей";
    }
}