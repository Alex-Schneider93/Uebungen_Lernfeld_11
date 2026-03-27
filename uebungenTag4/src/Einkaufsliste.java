import java.util.ArrayList;

public class Einkaufsliste {
    static void main() {

        ArrayList<String> artikelListe = new ArrayList<>();
        String eingabe = IO.readln("Eingabe: ");

     while (!eingabe.equals("fertig") ) {
         artikelListe.add(eingabe);
         eingabe = IO.readln("Eingabe: ");
         if  (eingabe.equals("fertig")) {
             for (String artikel :artikelListe){
                 IO.println("Artikel - " + artikel);
             }
         }
     }

     String artikelLoeschen = IO.readln("Welche Artikel wollen Sie löschen? :  ");
     ArrayList<String> geloeshteartikeln = new ArrayList<>();

     while (!artikelLoeschen.equals("nein") ) {
         artikelListe.remove(artikelLoeschen);
         geloeshteartikeln.add(artikelLoeschen);
         artikelLoeschen = IO.readln("Weitere Artikel löschen ? : ");
                 if (artikelLoeschen.equals("nein")) {
                     IO.println("Neue Liste: " + artikelListe);
                 }
     }
        IO.println("Gelöschte Artikel:  " + geloeshteartikeln);
    }
}
