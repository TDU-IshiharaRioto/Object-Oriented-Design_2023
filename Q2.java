public class Q2 {
    public static void main(String[] args) {
        Spray spray1 = new Spray("��");
        spray1.setLeft(new Leaf("��"));
        
        Spray spray2 = new Spray("��");
        spray1.setRight(spray2);
        spray2.setLeft(new Leaf("��"));
        spray2.setRight(new Leaf("��"));
    }
}