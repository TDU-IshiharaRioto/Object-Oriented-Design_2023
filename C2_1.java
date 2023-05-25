public class C2_1 {
    public static void main(String[] args) {
        UserLocator users = new UserLocator();
        users.add(new Teacher("T999", "‚‹´"));
        users.add(new Student("06JK000", "—é–Ø"));
        users.add(new Student("06JK999", "ˆÉ“¡"));

        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            System.out.println (user.getId() + " " + user.getName());
        }
    }
}
