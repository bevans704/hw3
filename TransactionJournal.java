public abstract class TransactionJournal{
    protected String journalName;
    protected String transactions;




    public TransactionJournal(String journalName, String transactions) {
        this.journalName = journalName;
        this.transaction = new ArrayList<Transaction>();
    }




}

