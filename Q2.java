public class Q2 {
    public static void main(String[] args) {
        Spray spray1 = new Spray("さ");
        spray1.setLeft(new Leaf("で"));
        
        Spray spray2 = new Spray("し");
        spray1.setRight(spray2);
        spray2.setLeft(new Leaf("う"));
        spray2.setRight(new Leaf("れ"));
    }
}