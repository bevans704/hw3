import java.util.ArrayList;
import java.util.Objects;
public abstract class Bank implements IBank{
    private String bankID;
    private String bankName;
    private Address address;
    private ArrayList<Account> accounts;
    private ArrayList<Employee> employees;
    private ArrayList<Client> clients;
    private TransactionJournal transactionJournal;



    public Bank(String bankID, String bankName, Address address, ArrayList<Account>, ArrayList<Employee>, ArrayList<Client>, TransactionJournal transactionJournal) {
        this.bankID = bankID;
        this.bankName = bankName;
        this.address = address;
        this.accounts = accounts;
        this.employees = employees;
        this.clients = clients;
        this.transactionJournal = new ArrayList<TransactionJournal>();
    }

    public TransactionJournal getTransactionJournal() {
        return transactionJournal;
    }

    public void setTransactionJournal(TransactionJournal transactionJournal) {
        this.transactionJournal = transactionJournal
    }
    public String getBankID() {
        return bankID;
    }

    public void setBankID(String bankID) {
        this.bankID = bankID;
    }

    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address){
        this.address = address;
    }
    public ArrayList<Account> getAccounts(){
        return accounts
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
    public ArrayList<Employee> getEmployeess(){
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
    public ArrayList<Client> getClients(){
        return clients
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

}


    @Override
    public String toString() {
        return ("bankID: " + bankID +
                ", bankName: " + bankName +
                ", address: " + address);
    }
}
