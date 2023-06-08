public class Staff implements Employee {
    private String id;
    private String name;
    private int postNumber = 0;

    public Staff (String id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getPostNumber () {
        return this.postNumber;
    }

    public void setPostNumber (int postNumber) {
        this.postNumber = postNumber;
    }

    public String getId () {
        return this.id;
    }

    public String getName () {
        return this.name;
    }

    public String getCompellation () {
        return "В≥Вс";
    }
}
