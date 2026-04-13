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
    public void ausgabe() {
        IO.println("Benutzer: " + name + ", Beiträge: " + beiträge);
    }


}
