public class C3_1 {
    public static void main(String[] args) {
        UserLocator users = new UserLocator();
        users.add (new Teacher("T999", "‚‹´"));
        users.add (new Student("06JK000", "—é–Ø"));
        users.add (new Student("06JK999", "ˆÉ“¡"));
        users.add (new Staff("S100", "‚“c"));

        users.printUsers();
    }
}
