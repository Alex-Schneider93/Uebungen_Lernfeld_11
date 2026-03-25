public class Durchschnittsrechner {
    static void main() {
        // ---------------------------------------------------------
        // Aufgabe 7: Durchschnittsrechner
        // Benutzer gibt drei double-Werte ein.
        // Berechne den Durchschnitt.
        // Runde das Ergebnis auf zwei Nachkommastellen.
        // ---------------------------------------------------------

        double zahl1 = Double.parseDouble(IO.readln("Komma Zahl 1: "));
        double zahl2 =  Double.parseDouble(IO.readln("Komma Zahl 2: "));
        double zahl3 =  Double.parseDouble(IO.readln("Komma Zahl 3: "));

        double ergebnis = (zahl1 + zahl2 + zahl3)/ 3;
        IO.println(String.format("Ergebnis : %.2f",  ergebnis));


    }
}
