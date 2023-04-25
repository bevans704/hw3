public abstract class Transaction{
    protected String accountFrom;
    protected String accountTo;
    protected double amount;
    protected String date;
    protected String transactionType;
    protected boolean domestic;
    protected int refNumber;
    protected String address


    public Transaction(String accountFrom, String accountTo, double amount, String date, String transactionType, boolean domestic, int refNumber String address) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.amount = amount;
        this.date = date;
        this.transactionType = transactionType;
        this.domestic = domestic;
        this.refNumber = refNumber;
        this.address = address;
    }




}