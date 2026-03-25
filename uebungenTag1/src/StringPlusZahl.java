public class StringPlusZahl {
    static void main() {
        // ---------------------------------------------------------
        // Aufgabe 5: String + Zahl
        // Lies einen Namen und ein Alter ein.
        // Gib aus:
        // "Hallo <Name>, in 10 Jahren bist du <Alter+10>!"
        // ---------------------------------------------------------

        String name = IO.readln("Name: ");
        String alterString = IO.readln("Alter: ");
        int alter = Integer.parseInt(alterString);
        int ergebnis = alter + 10;

        IO.println("Hallo " + name + ", in 10 Jahren bist du " + ergebnis);
        
    }
}
