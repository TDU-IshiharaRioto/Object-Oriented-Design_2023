public class Q3 {
    public static void main(String[] args) {
        Spray spray = new Spray("‚ ");
        Spray left = new Spray("‚©");
        spray.setLeft(left);
        Spray right = new Spray("‚³");
        spray.setRight(right);

        left.setLeft(new Leaf("‚½"));
        left.setRight(new Leaf("‚È"));
        right.setLeft(new Leaf("‚Í"));
        right.setRight(new Leaf("‚Ü"));

        System.out.print (spray.getName());
        System.out.print (spray.getLeft().getName());
        System.out.print (spray.getRight().getName());
        System.out.print (left.getLeft().getName());
        System.out.print (left.getRight().getName());
        System.out.print (right.getLeft().getName());
        System.out.print (right.getRight().getName());
    }
}
