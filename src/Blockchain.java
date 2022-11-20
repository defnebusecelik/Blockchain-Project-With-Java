import java.util.ArrayList;
import java.util.List;
import java.lang.NullPointerException;
    public class Blockchain {
        private static List<Transaction> blockchain;
        public Blockchain() {
            blockchain = new ArrayList<>();
            blockchain.add(generateblock());
        }

        private Transaction generateblock() {
            Transaction firstblock = new Transaction("1",new java.util.Date(),"defne","rumeysa",260);
            firstblock.setPreviousHash(null);
            return firstblock;
        }
        public static void add(Transaction block) {
            Transaction newblock = block;
            newblock.setPreviousHash(blockchain.get(blockchain.size()-1).getHash());
            newblock.decodeHash();
            blockchain.add(newblock);
        }
        public static void printChain() {
            for(int i=0;i<blockchain.size();i++) {
                System.out.println(" Block : "+i);
                System.out.println("Version of Block : "+blockchain.get(i).getVersion());
                System.out.println("Time of transfer : "+blockchain.get(i).getTime());
                System.out.println("Previous Hash : "+blockchain.get(i).getPreviousHash());
                System.out.println("Current Block Hash : "+blockchain.get(i).getHash());
                System.out.println("Sender : "+blockchain.get(i).getSourceName());
                System.out.println("Reciever : "+blockchain.get(i).getTargetName());
                System.out.println("Amount sent : "+blockchain.get(i).getAmount());
                System.out.println();
                System.out.println();
            }
        }
    }
