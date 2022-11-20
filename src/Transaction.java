import java.util.Date;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.security.*;
public class Transaction {
    private String previousHash;
    private String hash;
    private String version;
    private Date time;
    private String sourceName;
    private String targetName;
    private int amount;

    public String getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Transaction(String version, Date time, String sourceName, String targetName, int amount) {
        this.version = version;
        this.time = time;
        this.sourceName = sourceName;
        this.targetName = targetName;
        this.amount = amount;
        this.hash = decodeHash();
    }

    public String decodeHash() {
        String dataToHash = "" + this.version + this.time + this.previousHash + this.amount;

        MessageDigest digest;
        String encoding = null;

        try {
            digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(dataToHash.getBytes(StandardCharsets.UTF_8));
            encoding = Base64.getEncoder().encodeToString(hash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        this.hash = encoding;
        return encoding;
    }
}

