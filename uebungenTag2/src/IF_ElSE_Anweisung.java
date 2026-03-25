public class IF_ElSE_Anweisung {
    static void main() {
   /*   Aufgabe 2: if-else-Anweisung
        Gegeben ist eine Variable punktzahl (int).
        Gib "Bestanden" aus, wenn die Punktzahl mindestens
        50 ist, sonst "Nicht bestanden".
        int punktzahl = 45;
        if-else-Anweisung implementieren */

        int punktzahl = Integer.parseInt(IO.readln("Punktzahl: "));

        if (punktzahl >= 50){
            IO.println("Bestanden");
        }else {
            IO.println("nicht bestanden");
        }

    }
}
