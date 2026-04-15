public class Moderator extends User {
    public Moderator(String username, int beitraege) {
        super(username, beitraege);
    }

    @Override
    public String toString() {
        return "Moderator: " + getUsername() + ", Beiträge: " + getBeitraege();
    }
}