package bankingApp.model;

public class Account {
    Integer accountId;
    String holderName;
    String accountType;
    boolean accountStatus;

    public Account(){

    }
    public Account(Integer accountId, String holderName, String accountType, boolean accountStatus) {
        this.accountId = accountId;
        this.holderName = holderName;
        this.accountType = accountType;
        this.accountStatus = accountStatus;
    }
}
