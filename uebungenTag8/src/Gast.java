public class Gast extends User {
    public Gast(String username) {

        super(username,0);
    }

    @Override
    public String toString() {
        return "Gast: " + getUsername() + ", Beiträge: " + getBeitraege();
    }
}