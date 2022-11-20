public class Transaction {
    private String sourceAddress;
    private String targetAddress;
    private int amount;

    public String getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public String getTargetAddress() {
        return targetAddress;
    }

    public void setTargetAddress(String targetAddress) {
        this.targetAddress= targetAddress;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Transaction(String sourceAddress, String targetAddress, int amount) {
        this.sourceAddress = sourceAddress;
        this.targetAddress = targetAddress;
        this.amount = amount;
    }
}
