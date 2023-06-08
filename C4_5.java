import java.util.ArrayList;
import java.util.Iterator;

public class C4_5 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Teacher("T999", "çÇã¥"));
        employees.add(new Staff("S100", "çÇìc"));
        C4_5.print(employees.iterator());
    }

    public static void print(Iterator<Employee> itr) {
        for (; itr.hasNext();) {
            Employee employee = itr.next();
            int postNumber = employee.getPostNumber();
            if (employee instanceof Teacher) {
                switch (postNumber) {
                    case 0:
                        System.out.print ("èïéË");
                        break;
                    case 1:
                        System.out.print ("çuét");
                        break;
                    case 2:
                        System.out.print ("èïã≥éˆ");
                        break;
                    case 3:
                        System.out.print ("ã≥éˆ");
                        break;
                }
            } else {
                switch (postNumber) {
                    case 0:
                        System.out.print ("Ç»Çµ");
                        break;
                    case 1:
                        System.out.print ("åWí∑");
                        break;
                    case 2:
                        System.out.print ("â€í∑");
                        break;
                    case 3:
                        System.out.print ("ïîí∑");
                        break;
                }
            }
            System.out.println(" " + employee.getId() + " " + employee.getName());
        }
    }
}
