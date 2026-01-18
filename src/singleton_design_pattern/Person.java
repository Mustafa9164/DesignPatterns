package singleton_design_pattern;

public class Person {

    public static void main(String[] args) {

       Account ac1=Account.createAccount();
       Account ac2= Account.createAccount();

        System.out.println(ac1==ac2);
    }
}
