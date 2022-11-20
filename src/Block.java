public class Block{

    public static void main(String[] args) {
        Block bChain = new Block();
        Block a = new Block("1",new java.util.Date(),"defne","rumeysa",260);
        Block b = new Block("2",new java.util.Date(),"rumeysa","ozgur",680);
        Block c = new Block("3",new java.util.Date(),"ozgur","defne",5000);
        Block d = new Block("4",new java.util.Date(),"ozgur","rumeysa",4200);
        Block e = new Block("5",new java.util.Date(),"rumeysa","defne",899);

        bChain.addBlock(a);
        bChain.addBlock(b);
        bChain.addBlock(c);
        bChain.addBlock(d);
        bChain.addBlock(e);

        bChain.printChain();
    }

}
