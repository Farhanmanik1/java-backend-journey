package banks;

class Account{
    public String name;
    protected String email;
    private String password;
    //getters & setters
    public String getPassword(){
        setPassword("Farhan");
        return this.password;
    }
    private void setPassword(String pass){
        this.password = pass;

    }
}

public class bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Farhan";
        account1.email = "Farhan@gmail.com";
        System.out.println(account1.getPassword());
    }
}