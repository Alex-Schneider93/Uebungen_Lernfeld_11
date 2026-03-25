public class Taschenrechner {
    static void main() {
        // ---------------------------------------------------------
        // Aufgabe 1: Einfacher Taschenrechner
        // Schreibe ein Programm, das:
        // - zwei ganze Zahlen vom Benutzer einliest
        // - Addition, Subtraktion, Multiplikation und Division berechnet
        // - die Ergebnisse ausgibt
        // ---------------------------------------------------------


        int zahl1 = Integer.parseInt(IO.readln( "Zahl 1 eingeben : " ));
        int zahl2 = Integer.parseInt(IO.readln( "Zahl 1 eingeben : " ));

        String operator = IO.readln( "+, -, *, /  ?: " );

        if (operator.equals("+")) {
            int ergebnis =  zahl1 + zahl2;
            IO.println(zahl1 + " + " + zahl2 + " = " + ergebnis);
        } else if (operator.equals("-")) {
            int ergebnis =  zahl1 - zahl2;
            IO.println(zahl1 + " - " + zahl2 + " = " + ergebnis);
        } else if (operator.equals(" * ")) {
            int ergebnis =  zahl1 * zahl2;
            IO.println(zahl1 + " * " + zahl2 + " = " + ergebnis);
        } else  if (operator.equals("/")) {
            int ergebnis =  zahl1 / zahl2;
            IO.println(zahl1 + " / " + zahl2 + " = " + ergebnis);
        }

    }
}
