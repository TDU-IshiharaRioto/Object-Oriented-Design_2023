public class Q3 {
    public static void main(String[] args) {
        Spray spray = new Spray("��");
        Spray left = new Spray("��");
        spray.setLeft(left);
        Spray right = new Spray("��");
        spray.setRight(right);

        left.setLeft(new Leaf("��"));
        left.setRight(new Leaf("��"));
        right.setLeft(new Leaf("��"));
        right.setRight(new Leaf("��"));

        System.out.print (spray.getName());
        System.out.print (spray.getLeft().getName());
        System.out.print (spray.getRight().getName());
        System.out.print (left.getLeft().getName());
        System.out.print (left.getRight().getName());
        System.out.print (right.getLeft().getName());
        System.out.print (right.getRight().getName());
    }
}
