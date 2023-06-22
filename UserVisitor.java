public interface UserVisitor extends Visitor {
    public void visit (Teacher teacher);
    public void visit (Student student);
    public void visit (Staff staff);
}
