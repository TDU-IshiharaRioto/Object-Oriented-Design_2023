public class PrintVisitor implements UserVisitor {
    public void visit (User user) {
        System.out.println("ユーザーです。");
    }

    public void visit (Teacher teacher) {
        System.out.println("先生です。");
    }

    public void visit (Student student) {
        System.out.println("生徒です。");
    }

    public void visit (Staff staff) {
        System.out.println("職員です。");
    }
}
