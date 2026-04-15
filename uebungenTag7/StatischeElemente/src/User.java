public class User {

    private String name;
    private int beiträge;
    private static int userZaehler;


    public static int getUserZaehler() {
        return userZaehler;
    }


    public User(String name, int beiträge) {
        this.name = name;
        userZaehler++;
        this.beiträge = beiträge;

    }

    public User() {
        this.name = "Unbekannt";
        userZaehler++;
        this.beiträge = 0;

    }

    public User(String name) {
        this.name = name;
        userZaehler++;
        this.beiträge = 0;

    }

    public int getBeiträge() {
        return beiträge;
    }

    public void setBeiträge(int beiträge) {
        if (beiträge >= 0) {
            this.beiträge = beiträge;
        } else {
            IO.println("Fehler den Beiträge wert soll kein negative Zahl sein!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //   public String ausgabe() {return "Name: " + this.name +   ", Beiträge: " + beiträge + ", ";}

    //}
    @Override
    public String toString() {
        return "Name: " + name + ", Beiträge: " + beiträge;
    }


}




