import java.util.Date;

public class Block{

    public static void main(String[] args) {
        //Transaction bChain = new Transaction();
        Transaction a = new Transaction("1",new java.util.Date(),"defne","rumeysa",260);
        Transaction b = new Transaction("2",new java.util.Date(),"rumeysa","ozgur",680);
        Transaction c = new Transaction("3",new java.util.Date(),"ozgur","defne",5000);
        Transaction d = new Transaction("4",new java.util.Date(),"ozgur","rumeysa",4200);
        Transaction e= new Transaction("5",new java.util.Date(),"rumeysa","defne",899);

        Blockchain.add(a);
        Blockchain.add(b);
        Blockchain.add(c);
        Blockchain.add(d);
        Blockchain.add(e);

        Blockchain.printChain();
    }
}
