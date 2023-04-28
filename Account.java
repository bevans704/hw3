public abstract class Account {
    protected String accountName;
    protected int accountNumber;

    public boolean interestBearing = true;


    public Account(String accountName, int accountNumber, boolean interestBearing) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.interestBearing = interestBearing;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean isInterestBearing() {
        return interestBearing;
    }

    public void setInterestBearing(boolean interestBearing) {
        this.interestBearing = interestBearing;
    }
}




