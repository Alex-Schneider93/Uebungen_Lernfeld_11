public class ELSE_IF_Kette {
    static void main() {
        /* Aufgabe 3: else-if-Kette
        Gegeben ist eine Variable note (int von 1 bis 6).
        Gib eine passende Textbeschreibung aus:
        1 = "Sehr gut"
        2 = "Gut"
        3 = "Befriedigend"
        4 = "Ausreichend"
        5 = "Mangelhaft"
        6 = "Ungenügend"
        int note = 3;
        else-if-Kette implementieren */

        int note = 3;

        if (note == 1){
            IO.println("Sehr gut");
        } else if (note == 2) {
            IO.println("Gut");
        } else if (note == 3) {
            IO.println("Befriedigend");
        } else if (note == 4) {
            IO.println("Ausreichend");
        } else if (note == 5) {
            IO.println("Mangelhaft");
        } else if (note == 6) {
            IO.println("Ungenügend");
        } else {
            IO.println("Kein Note ");
        }

    }
}
