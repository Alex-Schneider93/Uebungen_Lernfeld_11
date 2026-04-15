import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();

        int gesamtBeitraege = 0;

        User Alex = new User("Alex", 10);
        users.add(Alex);

        User Quang = new User("Quang", 50);
        users.add(Quang);


        Moderator Tomm = new Moderator("Tomm", 20);
        users.add(Tomm);

        Gast Flo = new Gast("Flo");
        users.add(Flo);

        Gast Thomas = new Gast("Thomas");
        users.add(Thomas);


        for (User u : users) {
            IO.println(u);
        }
        boolean istVorhanden = false;


        for (User beiträge : users) {
            gesamtBeitraege +=  beiträge.getBeitraege();

        }

        IO.println("Gesamte Beiträge: " + gesamtBeitraege);

        String suche = IO.readln("Name eingeben: ");

        for (User u : users) {
            if (suche.equals(u.getUsername()))
            {
                istVorhanden = true;
                IO.println("den Name " + suche + " ist  vorhanden!");
                IO.println(u);
            }
        }

        if (!istVorhanden) {
            IO.println("den Name " + suche + " ist nicht vorhanden!");
        }

        users.removeIf(u -> u instanceof Gast);

        IO.println("Liste ohne 'GAST' Users");

        for (User u :users ) {
            IO.println(u.toString());
        }

    }
}