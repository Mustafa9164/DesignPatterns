package ptototype_pattern;

public class EmailService {

    public static void main(String[] args) {

        Email email=new Email(
                "qwerty@123gmail.com",
                "Welcome to Prototype Pattern",
                "This is a sample email body."
        );

        Email email1= (Email) email.clone();
        email1.setRecipient("user@gmail.com");
        email1.setBody("Hello User, This is a cloned email body.");

        Email email2= (Email) email.clone();
        email2.setRecipient("user2@gmail.com");
        email2.setBody("Hello User2, This is another cloned email body.");

        email1.displayEmail();
        email2.displayEmail();
    }
}
