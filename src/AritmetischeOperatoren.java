public class AritmetischeOperatoren {
    static void main() {
        double preis1 = 3.99;
        double preis2 = 4.99;

        IO.println("Gesammtpreis= " + (preis1 + preis2));
        IO.println("preis1 - preis2= " + (preis1 - preis2));
        IO.println("preis2 * preis2= " + (preis2 * preis2));
        IO.println("preis1 / preis2= " + (preis1 / preis2));
        IO.println("preis1  % preis2= " + (preis1 % preis2));

        IO.println("Modulo Ganzzahl: " + (5 % 3));


        // Zuweisungsoperatoren

        preis1 = (preis1 + 2);
        preis1 += 2;    // funktioniert auch mit  -, *, / , %


    }
}
