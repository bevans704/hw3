public class IndividualAccount extends Account implements IAcount{
    private boolean jointAccount;
    private String memberLevel;

    public IndividualAccount(boolean jointAccount, String memberLevel) {
        this.jointAccount = jointAccount;
        this.memberLevel = memberLevel;

    }

    public boolean isJointAccount() {
        return jointAccount;
    }

    public void setJointAccount(boolean jointAccount) {
        this.jointAccount = jointAccount;
    }

    public String getMemberLevel() {
        return memberLevel;
    }

    public void setMemberLevel(String memberLevel) {
        this.memberLevel = memberLevel;
    }
}
