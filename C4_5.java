import java.util.ArrayList;
import java.util.Iterator;

public class C4_5 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Teacher("T999", "‚‹´"));
        employees.add(new Staff("S100", "‚“c"));
        C4_5.print(employees.iterator());
    }

    public static void print(Iterator<Employee> itr) {
        /*
        String[] posts1 = {"•è", "ut", "•‹³ö", "‹³ö"};
        String[] posts2 = {"‚È‚µ", "ŒW’·", "‰Û’·", "•”’·"};
        for (; itr.hasNext();) {
            Employee employee = itr.next();
            int postNumber = employee.getPostNumber();
            if (employee instanceof Teacher) {
                switch (postNumber) {
                    case 0:
                        System.out.print ("•è");
                        break;
                    case 1:
                        System.out.print ("ut");
                        break;
                    case 2:
                        System.out.print ("•‹³ö");
                        break;
                    case 3:
                        System.out.print ("‹³ö");
                        break;
                }
                System.out.print(posts1[postNumber]);
            } else {
                switch (postNumber) {
                    case 0:
                        System.out.print ("‚È‚µ");
                        break;
                    case 1:
                        System.out.print ("ŒW’·");
                        break;
                    case 2:
                        System.out.print ("‰Û’·");
                        break;
                    case 3:
                        System.out.print ("•”’·");
                        break;
                }
                System.out.print(posts2[postNumber]);
            }
            System.out.println(" " + employee.getId() + " " + employee.getName());
        }
        */
        for (; itr.hasNext();) {
            Employee employee = itr.next();
            System.out.println(employee.getPost() + " " + employee.getId() + " " + employee.getName());
        }
    }
}
