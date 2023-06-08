public class Teacher extends AbstractEmployee {

    public Teacher (String id, String name) {
        super(id, name);
    }

    /*
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
    */

    public String getCompellation () {
        return "�搶";
    }

    public String getPost () {
        String[] posts = {"����", "�u�t", "������", "����"};
        if (this.getPostNumber() < posts.length) {
            return posts[this.getPostNumber()];
        } else {
            return "";
        }
    }
}
