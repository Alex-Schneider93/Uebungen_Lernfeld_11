public class User {
    private String username;
    private int beitraege;
    private static int userZaehler = 0;

    public User(String username, int beitraege) {
        this.username = username;
        this.beitraege = beitraege;
        userZaehler++;
    }

    public String getUsername() {
        return username;
    }

    public int getBeitraege() {
        return beitraege;
    }

    public static int getUserZaehler() {
        return userZaehler;
    }

    @Override
    public String toString() {
        return "User: " + username + ", Beiträge: " + beitraege ;
    }
}