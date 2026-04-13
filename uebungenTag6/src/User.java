public class User {
    String username;
    int beitragsAnzahl;

    public void  ausgabe(){
        IO.println("Benutzer : " + username+ " , Beiträge: " + beitragsAnzahl);
    }
}
