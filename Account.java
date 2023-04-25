public abstract class Account{
    protected String accountName;
    protected int accountNumber;

    public static final boolean interestBearing = true;


    public Account(String accountName, int accountNumber, boolean interestBearing) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.interestBearing = interestBearing;
    }




