public class Main {
    static void main() {
        // einzeiliger kommentar
        /*  Das
        ist ein
         Mehrzeiliger
         Kommentar */

        // Ausgabe Konsole:
        IO.println("Meine erste Ausgabe");
        //Alternative:
        System.out.println("Meine zweite Aussgabe");
        // Datentypen in Java
        // char, int, boolean, float, short, long,

        byte meinByte = 5;
        short meinShort = 28000;
        int meinInt = 1510; // häufig genutzt
        long meinLong = 100000000;

        float meinFloat = 3.14f;
        double meinDouble = 1.23;

        char meinChar = 'a';

        boolean meinBoolean = true; // oder "false"
        //Casting
        int meinNeuerInt = (int) meinDouble;
        IO.println("Mein int: " +  meinNeuerInt);

        //Casting; Grösser auf Kleiner
        double meinNeuerDouble = meinNeuerInt;
        IO.println("Mein Double: " +  meinNeuerDouble);

        // Escape Seqenz
        IO.println("Heute sagen wir \"juhu\" ");
        IO.println("Heute sagen wir 'Juhu' ");

        IO.println("Es gibt heute zwei Optionen: \n1: Lasagne\n2: Kartoffeln");




    }
}
