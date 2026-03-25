public class Modulo_Rechner {
    static void main() {
        // ---------------------------------------------------------
        // Aufgabe 6: Modulo-Rechner
        // Lies eine ganze Zahl ein und gib aus:
        // - ob sie gerade oder ungerade ist
        // - ob sie durch 3 teilbar ist
        // - ob sie durch 5 teilbar ist
        // Nutze dazu den Modulo-Operator (%).
        // ---------------------------------------------------------


        int ganzeZahl = Integer.parseInt(IO.readln( "Zahl eingabe: " ));
        if (ganzeZahl % 2 == 0) {
            IO.println(ganzeZahl + " ist gerade!");
        } else if (ganzeZahl % 3 == 0) {
            IO.println(ganzeZahl + " ist durch 3 teilbar!");
        } else if (ganzeZahl % 5 == 0) {
            IO.println(ganzeZahl + " ist durch 2 teilbar!");
        }

    }
}
