package builder_design_pattern;

public class Person {

    private String name;
    private int age;
    private String city;

    Person(PersonBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.city = builder.city;
    }

    public void show() {
        System.out.println(name + " " + age + " " + city);
    }
}
