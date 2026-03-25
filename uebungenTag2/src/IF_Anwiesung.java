public class IF_Anwiesung {
    static void main() {
     /* Aufgabe 1: if-Anweisung
        Schreibe ein Programm, das eine Variable alter (int) hat. Gib aus, ob die Person volljährig ist
        (ab 18 Jahren) oder nicht.
        int alter = 17;
        if-Anweisung verwenden, um zu prüfen, ob alter >= 18 ist
        Ausgabe "Volljährig" oder "Minderjährig"   */

        int alter = 17;

        if (alter >= 18) {
            IO.println("Volljährig");
        }
        if (alter < 18) {
            IO.println("Mindertjährig");
        }
    }
}

