public class Preisberechnung {
    static void main() {
        // ---------------------------------------------------------
        // Aufgabe 8: Preisberechnung mit Mehrwertsteuer
        // Lies ein:
        // - Nettopreis (double)
        // - Mehrwertsteuer in % (double)
        // Berechne den Bruttopreis:
        // Brutto = Netto * (1 + MwSt/100)
        // ---------------------------------------------------------

        double netto = Double.parseDouble(IO.readln("Nettopreis : "));
        double mehrwertsteuer = Double.parseDouble(IO.readln("Mehrwertsteuer % : "));

        double brutto = netto * (1 + mehrwertsteuer/ 100);

        IO.println(String.format("%.2f", brutto));

    }
}
