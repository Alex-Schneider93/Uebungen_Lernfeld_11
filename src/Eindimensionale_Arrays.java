import java.util.Arrays;
public class Eindimensionale_Arrays {
    static void main() {
        // Deklaration eines Arrays
        String[] artikelArray;

        // Initialisierung mit fester Größe
        artikelArray = new String[5];

        // Deklaration und Initialisierung in einer Zeile
        String[] bestellungen = new String[5];

        // Hinzufügen von Elementen
        // Zugriff über Index
        artikelArray[0] = "Laptop";
        artikelArray[1] = "Maus";
        artikelArray[2] = "Tastatur";
        artikelArray[3] = "Magic Pad";
        artikelArray[4] = "Handy";

        // Länge kann via array.length ermittelt werden
        // Ausgabe der einzelnen Werte via for-Schleife über den Index
        for (int i = 0; i < artikelArray.length; i++) {
            IO.println(artikelArray[i]);
        }

        IO.println("Mit for-each:");
        // Ausgabe mit Enhanced For-Schleife (for-each)
        for (String artikel : artikelArray) {
            IO.println(artikel);
        }

        // Direkte Deklaration und Initialisierung (Array-Literal)
        double[] preise = {599.99, 9.99, 19.99, 119.99, 499.99};

        // Fehlerbeispiel: ArrayIndexOutOfBoundsException
        // IO.println(preise[5]); // funktioniert nicht: Index 5 out of bounds for length 5


        // Befüllung von Werten in einem Array durch Nutzereingabe - Beispiel
        String[] gaeste = new String[4];

        for (int i = 0; i < gaeste.length; i++) {
            gaeste[i] = IO.readln("Bitte den Namen des Gastes eingeben: ");
        }

        IO.println(Arrays.toString(gaeste));
    }
}

