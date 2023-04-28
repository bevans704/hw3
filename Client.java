import java.util.ArrayList;
public class Client extends Person implements IClient{
    private int clientID;
    private String clientStatus;
    private ArrayList<Account> accounts;
    public Client(int clientID, String clientStatus, ArrayList<Account> accounts) {
        this.clientID = clientID;
        this.clientStatus = clientStatus;
        this.accounts = accounts;

    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getClientStatus() {
        return clientStatus;
    }

    public void setClientStatus(String clientStatus) {
        this.clientStatus = clientStatus;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {

    }
}

