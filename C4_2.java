import java.util.ArrayList;
import java.util.Iterator;

public class C4_2 {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User> ();
        users.add (new Teacher("T999", "‚‹´"));
        users.add (new Teacher("S100", "‚“c"));
        C4_2.print (users.iterator());
    }

    public static void print (Iterator<User> itr) {
        for (; itr.hasNext(); ) {
            User user = itr.next();
            System.out.println(user.getId() + " " + user.getName());
        }
    }
}
