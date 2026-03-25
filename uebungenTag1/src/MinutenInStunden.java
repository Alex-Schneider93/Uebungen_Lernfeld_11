public class MinutenInStunden {
    static void main() {
        // ---------------------------------------------------------
        // Aufgabe 4: Minuten in Stunden und Minuten umrechnen
        // Der Benutzer gibt eine Anzahl Minuten ein.
        // Rechne sie um in:
        // - volle Stunden
        // - verbleibende Minuten
        // Beispiel: 135 → 2 Stunden und 15 Minuten
        // ---------------------------------------------------------


         double minuten = Double.parseDouble(IO.readln( "Minnuten eingabe: " ));

         double stunden =  minuten / 60.0;

         double Minuten = minuten % 60.0;
                IO.println(String.format("Stunden: %.2f, Minuten: %.2f",stunden, Minuten));

    }
}
