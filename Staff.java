public class Staff extends AbstractEmployee {

    public Staff (String id, String name) {
        super(id, name);
    }

    /*
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
    */
    public String getCompellation () {
        return "����";
    }

    public String getPost () {
        String[] posts = {"�Ȃ�", "�W��", "�ے�", "����"};
        if (this.getPostNumber() < posts.length) {
            return posts[this.getPostNumber()];
        } else {
            return "";
        }
    }
}
