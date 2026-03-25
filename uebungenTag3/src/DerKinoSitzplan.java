public class DerKinoSitzplan {
    static void main() {

        /*
Stell dir vor, du verwaltet einen kleinen Kinosaal mit 3 Reihen und 4 Sitzen pro Reihe.
1. Initialisierung: Erstelle ein 2D-Integer-Array namens kino, das 3 Zeilen und 4 Spalten hat.
2. Belegung: Fülle das Array so, dass alle Sitze zuerst den Wert 0 (frei) haben.
Belege dann manuell folgende Sitze
mit einer 1 (besetzt): (Hinweis: Achte auf die Null-Indizierung!)
Reihe 1, Sitz 2
Reihe 2, Sitz 4
Reihe 3, Sitz 1
(Hinweis: Achte auf die Null-Indizierung!)
3. Ausgabe: Gib den gesamten Sitzplan als Tabelle auf der Konsole aus.
Nutze dafür zwei verschachtelte for-
Schleifen.
4. Zusatz: Gib am Ende aus, wie viele Sitze insgesamt im Kino vorhanden sind
(nutze kino.length und kino[0].length).
         */

        int [] [] kino =  new int [3] [4];

        kino[0][1] = 1; // Reihe 1, Sitz 2
        kino[1][3] = 1; // Reihe 2, Sitz 4
        kino[2][0] = 1; // Reihe 3, Sitz 1

        for (int zeilen = 0; zeilen < kino.length; zeilen++) {
            for (int spalten = 0; spalten < kino[zeilen].length; spalten++) {
                IO.print(kino[zeilen][spalten] + " ");
            }
            IO.println();
        }
    }
}
