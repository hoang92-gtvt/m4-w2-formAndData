package model;

public class User {
    private  String accountl;
    private  String pass;
    private  String name;
    private  String email;
    private int age;

    public User() {

    }

    public User(String accountl, String pass, String name, String email, int age) {
        this.accountl = accountl;
        this.pass = pass;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getAccountl() {
        return accountl;
    }

    public void setAccountl(String accountl) {
        this.accountl = accountl;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
