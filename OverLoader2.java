public class OverLoader2 {
    public void print (User user) {
        System.out.println (user.getName());
    }

    public void print (Staff staff) {
        this.print((User)staff);
    }

    public void print (Student student) {
        this.print((User)student);
    }

    public void print (Teacher teacher) {
        this.print((User)teacher);
    }
}
