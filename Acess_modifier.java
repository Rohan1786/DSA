class Account {
    String name;
    public int age;
    protected String email;

    // for private access modifier we have getters and setters for set private
    // values of java function

    private String password;

    public String getters() {
        return this.password;
    }

    public void setters(String pass) {
        this.password = pass;

    }
}

public class Acess_modifier {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "rohan";
        a1.age = 21;
        a1.email = "rp@gmail.com";
        // a1.password="1234"; this will not work cause of accesssibility

        a1.setters("1234");
        System.out.println(a1.getters());

    }
}
