public abstract class Bank{
    protected String bankID;
    protected String bankName;

    protected String address;


    public Bank(String bankID, String bankName, String address) {
        this.bankID = bankID;
        this.bankName = bankName;
        this.address = address;
    }



    @Override
    public String toString() {
        return ("bankID: " + bankID +
                ", bankName: " + bankName +
                ", address: " + address);
    }
}
