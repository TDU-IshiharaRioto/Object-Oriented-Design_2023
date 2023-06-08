public class Teacher implements Employee {
    public String id;
    public String name;
    public int postNumber = 0;

    public Teacher (String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId () {
        return this.id;
    }

    public String getName () {
        return this.name;
    }

    public int getPostNumber () {
        return this.postNumber;
    }

    public void setPostNumber (int postNumber) {
        this.postNumber = postNumber;
    }

    public String getCompellation () {
        return "æ¶";
    } 
}
