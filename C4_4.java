import java.util.ArrayList;
import java.util.Iterator;

public class C4_4 {
    public static void main(String[] args) {
        ArrayList<Employee> enployees = new ArrayList<Employee> ();
        enployees.add(new Teacher("T999", "çÇã¥"));
        enployees.add(new Staff("S100", "çÇìc"));
        C4_4.print (enployees.iterator());
    }

    public static void print (Iterator<Employee> itr) {
        for (; itr.hasNext(); ) {
            Employee employee = itr.next();
            System.out.println(employee.getPostNumber() + " " + employee.getId() + " " + employee.getName());
        }
    }
}
