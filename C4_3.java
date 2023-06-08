import java.util.ArrayList;
import java.util.Iterator;

public class C4_3 {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User> ();
        users.add(new Teacher("T999", "‚‹´"));
        users.add(new Staff("S100", "‚“c"));
        C4_3.print (users.iterator());
    }

    public static void print (Iterator<User> itr) {
        for (; itr.hasNext(); ) {
            User user = itr.next();
            if (user instanceof Teacher) {
                Teacher teacher = (Teacher)user;
                System.out.print (teacher.getPostNumber() + " ");
            } else {
                Staff staff = (Staff)user;
                System.out.print (staff.getPostNumber() + " ");
            }
            System.out.println (user.getId() + " " + user.getName());
        }
    }
}
