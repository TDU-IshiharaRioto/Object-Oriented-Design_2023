public class C1_3 {
    public static void main(String[] args) {
        Pair pair = new Pair();

        Instructor i = new Instructor("001");
        i.setName("kohama");
        pair.setFirst(i);

        Assistant a = new Assistant();
        a.setName("takano");
        a.setId("002");
        pair.setSecond(a);

        System.out.println (pair.getFirst().getName());
        System.out.println (pair.getSecond().getName());
    }
}
