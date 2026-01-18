package singleton_design_pattern;

public class Account {

    private static Account ac;
    private Account(){
        System.out.println("Create Account");
    }

    public static Account createAccount(){
        if(ac==null) {
            ac = new Account();
        }
        return ac;
    }

}
