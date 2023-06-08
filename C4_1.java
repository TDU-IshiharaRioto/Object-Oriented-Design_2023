import java.util.ArrayList;
import java.util.Iterator;

public class C4_1 {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User> ();
        users.add (new Teacher("T999", "‚‹´"));
        users.add (new Teacher("S100", "‚“c"));

        for (Iterator<User> itr = users.iterator(); itr.hasNext();) {
            User user = itr.next();
            System.out.println(user.getId() + " " + user.getName());
        }
    }
}