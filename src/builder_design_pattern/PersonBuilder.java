package builder_design_pattern;

public class PersonBuilder {

    String name;
    int age;
    String city;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        return this;
    }
    public Person build() {
        return new Person(this);
    }
}
