import java.util.ArrayList;
import java.util.Iterator;

public class C4_5 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Teacher("T999", "����"));
        employees.add(new Staff("S100", "���c"));
        C4_5.print(employees.iterator());
    }

    public static void print(Iterator<Employee> itr) {
        /*
        String[] posts1 = {"����", "�u�t", "������", "����"};
        String[] posts2 = {"�Ȃ�", "�W��", "�ے�", "����"};
        for (; itr.hasNext();) {
            Employee employee = itr.next();
            int postNumber = employee.getPostNumber();
            if (employee instanceof Teacher) {
                switch (postNumber) {
                    case 0:
                        System.out.print ("����");
                        break;
                    case 1:
                        System.out.print ("�u�t");
                        break;
                    case 2:
                        System.out.print ("������");
                        break;
                    case 3:
                        System.out.print ("����");
                        break;
                }
                System.out.print(posts1[postNumber]);
            } else {
                switch (postNumber) {
                    case 0:
                        System.out.print ("�Ȃ�");
                        break;
                    case 1:
                        System.out.print ("�W��");
                        break;
                    case 2:
                        System.out.print ("�ے�");
                        break;
                    case 3:
                        System.out.print ("����");
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
