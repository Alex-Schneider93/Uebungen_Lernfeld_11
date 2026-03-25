import javax.swing.*;
import java.util.Arrays;
import java.util.function.BinaryOperator;

public class MittelwerteUndBerechnungen {
    static void main() {
        /*
        Befülle durch eine Nutzereingabe (Konsole/JOptionPane)
         deiner Wahl ein int-Array mit 6 Elementen.
        Implementiere ein Programm, das die Summe aller Elemente im Array berechnet.
        Ermittel dann den Durchschnitt (als double) und speichere ihn in einer Variable.
        Ausgabe: Alle Werte des Arrays (z.B. mit Arrays.toString(deinArray)), die Summe
        und der Durchschnitt.
         */

        int[] zahlen = new int[6];
        int summe = 0;

        for (int i = 0; i < zahlen.length; i++) {
            String eingabe = JOptionPane.showInputDialog("Zahl " + (i+1) + "von " + zahlen.length);
            zahlen[i] = Integer.parseInt(eingabe);
            summe += zahlen[i];
        }
        double durchsnitt = summe / zahlen.length;
        IO.println(Arrays.toString(zahlen));
        IO.println("Summe: " + summe);
        IO.println(String.format("Durchsnitt %.2f: ", durchsnitt));
    }
    }

