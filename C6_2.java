public class C6_2 {
    public static void main(String[] args) {
        C6_2.test2();
        C6_2.test3();
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

    public static void test3 () {
        PrintVisitor printVisitor = new PrintVisitor();
        User teacher = new Teacher("T999", "����");
        User student = new Student("06JK000", "���");
        User staff = new Staff("S00", "���q");
        teacher.accept(printVisitor);
        student.accept(printVisitor);
        staff.accept(printVisitor);
    }
}
