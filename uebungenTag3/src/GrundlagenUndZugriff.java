public class GrundlagenUndZugriff {
    static void main() {
       /*
        Erstelle ein Programm,
        das ein Integer-Array namens zahlen mit den Werten 10, 20, 30, 40, 50 initialisiert.
        Gib das erste und das letzte Element des Arrays auf der Konsole aus.
        Ändere den Wert des zweiten Elements (Index 1) auf 25.
        Gib das gesamte Array mithilfe einer einfachen for-Schleife aus.
        */

        Integer [] zahlen = {10, 20, 30, 40, 50};

        IO.println("Erste: " + zahlen[0] +  " Letzte: " + zahlen[zahlen.length - 1]);
        zahlen[1] = 25;

        for (int i = 0; i < zahlen.length; i++){
        IO.println(" " + zahlen[i]);
        }
    }
}
