public class C1_2 {
    public static void main(String[] args) {
        Person p1 = new Assistant();

        Assistant a1 = (Assistant)p1;

        a1.setName ("takano");
        a1.setId ("002");

        System.out.println (a1.getId() + " " + a1.getName());
    }
}
