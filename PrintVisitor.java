public class PrintVisitor implements UserVisitor {
    public void visit (User user) {
        System.out.println("���[�U�[�ł��B");
    }

    public void visit (Teacher teacher) {
        System.out.println("�搶�ł��B");
    }

    public void visit (Student student) {
        System.out.println("���k�ł��B");
    }

    public void visit (Staff staff) {
        System.out.println("�E���ł��B");
    }
}
