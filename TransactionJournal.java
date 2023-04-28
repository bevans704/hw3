import java.util.ArrayList;
public abstract class TransactionJournal{
    protected String journalName;
    protected ArrayList<Transaction> transactions;




    public TransactionJournal(String journalName, ArrayList<Transaction> transactions) {
        this.journalName = journalName;
        this.transactions = transactions;
    }

    public String getJournalName() {
        return journalName;
    }

    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    @override
    public void addTransaction(Transaction transaction){


    }
}

