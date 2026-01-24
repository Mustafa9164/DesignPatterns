package builder_design_pattern;

public class MainClass {

    public static void main(String[] args) {

        PersonBuilder builder = new PersonBuilder();
        Person person = builder.setName("Alice")
                               .setAge(30)
                               .setCity("New York")
                               .build();

        person.show();
    }
}
