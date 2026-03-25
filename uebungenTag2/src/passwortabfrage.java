public class passwortabfrage {
    static void main() {
        /*
Schreibe ein Programm, das den Benutzer nach einem Passwort fragt und
maximal drei Versuche erlaubt.
Das richtige Passwort ist z.B. "geheim123".
Der Benutzer hat drei Versuche, das Passwort einzugeben.
Wenn das Passwort korrekt ist, gib aus: "Zugriff gewährt"
Wenn das Passwort falsch ist, gib aus, wie viele Versuche übrig sind:
"Falsches Passwort. Noch 2 Versuche."
Nach dem dritten Fehlversuch: "Zugriff verweigert"
         */


        String eingabe =  IO.readln("Passwort eingeben: ");
        int versuche = 3;
        String passwort = "geheim123";

        while(versuche !=0){
            if (eingabe.equals(passwort)) {
                IO.println("Passwort richtig!");
                break;
            }

            IO.println("Falsches Passwort Sie haben noch " + versuche + " Versuche");
            versuche -= 1;
            eingabe = IO.readln("Passwort eingeben: ");

            if (versuche == 0) {
                IO.println("Keine versuche mehr!");
                break;
            }

    }
}
}
