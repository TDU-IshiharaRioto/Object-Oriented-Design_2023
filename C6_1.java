public class C6_1 {
    public static void main(String[] args) {
        C6_1.test1();
        C6_1.test2();
    }

    public static void test1() {
        PrintVisitor printVisitor = new PrintVisitor();
        Teacher teacher = new Teacher("T999", "����");
        Student student = new Student("06JK000", "���");
        Staff staff = new Staff("S00", "���q");
        printVisitor.visit(teacher);
        printVisitor.visit(student);
        printVisitor.visit(staff);
    }

    public static void test2 () {
        PrintVisitor printVisitor = new PrintVisitor();
        User teacher = new Teacher("T999", "����");
        User student = new Student("06JK000", "���");
        User staff = new Staff("S00", "���q");
        printVisitor.visit(teacher);
        printVisitor.visit(student);
        printVisitor.visit(staff);
    }
}
