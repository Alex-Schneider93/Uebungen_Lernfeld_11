public class zahlenDreieck {
    static void main() {
     /*  Geben Sie mithilfe einer while-Schleife folgende Figur aus Zahlen auf dem Bildschirm aus.
        Hinweis: Pro Schreibvorgang darf jeweils nur eine Zahl ausgegeben werden.
        0
        0 1
        0 1 2
        0 1 2 3
        0 1 2 3 4
        0 1 2 3 4 5
        0 1 2 3 4 5 6
        0 1 2 3 4 5 6 7
        0 1 2 3 4 5 6 7 8
        0 1 2 3 4 5 6 7 8 9


        Versuchen Sie, diese Ausgabe auch mit einer for-Schleife zu erreichen */

        int hoehe = 5;

        for (int i = 0; i <= hoehe; i++) {
            IO.println();
            for (int j = 0; j <= i; j++) {
                IO.print(j);
            }
        }

    }
}
