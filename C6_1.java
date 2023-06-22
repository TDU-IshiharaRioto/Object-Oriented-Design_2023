public class C6_1 {
    public static void main(String[] args) {
        C6_1.test1();
        C6_1.test2();
    }

    public static void test1() {
        PrintVisitor printVisitor = new PrintVisitor();
        Teacher teacher = new Teacher("T999", "çÇã¥");
        Student student = new Student("06JK000", "óÈñÿ");
        Staff staff = new Staff("S00", "ã‡éq");
        printVisitor.visit(teacher);
        printVisitor.visit(student);
        printVisitor.visit(staff);
    }

    public static void test2 () {
        PrintVisitor printVisitor = new PrintVisitor();
        User teacher = new Teacher("T999", "çÇã¥");
        User student = new Student("06JK000", "óÈñÿ");
        User staff = new Staff("S00", "ã‡éq");
        printVisitor.visit(teacher);
        printVisitor.visit(student);
        printVisitor.visit(staff);
    }
}
