public class C2_2 {
    public static void main(String[] args) {
        UserLocator users = new UserLocator();
        users.add(new Teacher("T999", "����"));
        users.add(new Student("06JK000", "���"));
        users.add(new Student("06JK999", "�ɓ�"));

        users.printUsers ();
    }
}
