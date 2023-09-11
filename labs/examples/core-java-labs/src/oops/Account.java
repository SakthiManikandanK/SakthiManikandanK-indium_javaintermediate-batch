package oops;

public abstract class Account {
    Integer id;
    String name;
    Boolean active;

    public Account() {
        System.out.println("Default Constructor called...");
    }

    abstract void openAccount();

    public void CloseAccount() {

    }

    public Account(Integer id, String name, Boolean active) {
        this.id = id;
        this.name = name;
        this.active = active;
    }
}
