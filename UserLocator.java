import java.util.ArrayList;

public class UserLocator {
    private ArrayList<User> users = new ArrayList<User>();

    public UserLocator () {

    }

    public void add (User user) {
        this.users.add(user);
    }

    public User get (int number) {
        return this.users.get(number);
    }

    public int size () {
        return this.users.size();
    }

    public void printUsers () {
        for (int i = 0; i < this.size(); i++) {
            User user = this.get(i);
            System.out.print (user.getId() + " ");
            System.out.print (user.getName());
            if (user instanceof Student | user instanceof Staff) {
                System.out.println (" ‚³‚ñ");
            } else {
                System.out.println (" æ¶");
            }
        }
    }

    public void printUsers (UserVisitor userVisitor) {
        for (int i = 0; i < this.size(); i++) {
            User user = this.get(i);
            user.accept(userVisitor);
        }
    }
}
