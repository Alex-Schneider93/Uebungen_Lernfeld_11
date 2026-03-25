public class Sekundenrechner {
    static void main() {
        // ---------------------------------------------------------
        // Aufgabe 9: Sekundenrechner
        // Benutzer gibt eine Anzahl Sekunden ein.
        // Rechne sie um in:
        // - Stunden
        // - Minuten
        // - Sekunden
        // Beispiel: 3665 → 1 h, 1 min, 5 sec
        // ---------------------------------------------------------


        int sekunden = Integer.parseInt(IO.readln("Sekunden eingabe : "));

        int stunden = sekunden / 3600;
        int minuten = sekunden % 3600 / 60;
        int seconden = sekunden % 60;
        IO.println(stunden + "h"  + ", " + minuten + "min" + ", " + seconden + "sec");


    }
}
