public class PrintVisitor2 {
    public void visit (User user) {
        System.out.println (user.getName());
    }

    public void visit (Teacher teacher) {
        System.out.println (teacher.getName() + "�搶�ł�");
    }

    public void visit (Student student) {
        System.out.println (student.getName() + "�i���k�j�ł�");
    }

    public void visit (Staff staff) {
        System.out.println (staff.getName() + "�i�E���j�ł�");
    }
}
