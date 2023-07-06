public class PrintVisitor2 {
    public void visit (User user) {
        System.out.println (user.getName());
    }

    public void visit (Teacher teacher) {
        System.out.println (teacher.getName() + "先生です");
    }

    public void visit (Student student) {
        System.out.println (student.getName() + "（生徒）です");
    }

    public void visit (Staff staff) {
        System.out.println (staff.getName() + "（職員）です");
    }
}
