import java.util.Random;
public class SucheUndLogik {

    static void main() {
        /*
Implementiere ein Programm, das ein Array nach dem größten und kleinsten Wert durchsucht.
Erstelle ein Array mit 10 zufälligen Ganzzahlen zwischen 1 und 100
(Hinweis: Nutze die Klasse Random dafür)
Finde mithilfe einer Schleife das Maximum und das Minimum in diesem Array.
Gib beide Werte sowie deren jeweilige Position (Index) im Array aus.
Zusatz: Sortiere das Array (du kannst Arrays.sort() verwenden) und prüfe,
ob deine gefundenen Werte mit dem ersten
und letzten Element des sortierten Arrays übereinstimmen.
         */

        Random zufallzahl = new Random();

        int zahlen = zufallzahl.nextInt(100)+1;
        IO.println(zahlen);

    }
}
