public class User {

    String name;
    int beiträge;

    public User (String name, int beiträge) {
        this.name = name;
        this.beiträge = beiträge;

    }

    public User() {
        this.name = "Unbekannt";
        this.beiträge = 0;

    }

    public User(String name) {
        this.name = name;
        this.beiträge = 0;

    }

    public String ausgabe() {return "Name: " + this.name +   ", Beiträge: " + beiträge + ", ";}

}
