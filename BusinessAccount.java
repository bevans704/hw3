public class BusinessAccount extends Account implements IAccount{
    private boolean draftProtection;
    private String upgradeOffer;

    public BusinessAccount(boolean draftProtection, String upgradeOffer) {
        this.draftProtection = draftProtection;
        this.upgradeOffer = upgradeOffer;

    }

    public boolean isDraftProtection() {
        return draftProtection;
    }

    public void setDraftProtection(boolean draftProtection) {
        this.draftProtection = draftProtection;
    }

    public String getUpgradeOffer() {
        return upgradeOffer;
    }

    public void setUpgradeOffer(String upgradeOffer) {
        this.upgradeOffer = upgradeOffer;
    }
}
