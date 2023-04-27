public abstract class Bank{
    protected String bankID;
    protected String bankName;

    protected String address;
    protected ArrayList<Account>;
    protected ArrayList<Employee>;
    protected ArrayList<Client>;
    protected ArrayList<TransactionJournal>;



    public Bank(String bankID, String bankName, String address, String accounts, String employees, String clients, String transactionJournal) {
        this.bankID = bankID;
        this.bankName = bankName;
        this.address = address;
        this.accounts = new ArrayList<Account>();
        this.employees = new ArrayList<Employee>();
        this.clients = new ArrayList<Client>();
        this.transactionJournal = new ArrayList<TransactionJournal>();
    }



    @Override
    public String toString() {
        return ("bankID: " + bankID +
                ", bankName: " + bankName +
                ", address: " + address);
    }
}
