public class VergleichsOperatoren {
    static void main() {

        double preis1 = 9.99;
        double preis2 = 15.99;
        double preis3 = 19.99;


        IO.println("Preis1 < Preis2 ? " + (preis1 < preis2));
        IO.println("Preis1 > Preis2 ? " + (preis1 > preis2));

        IO.println("Preis1 = Preis2 ? " + (preis1 == preis2));
        IO.println("Preis1 = Preis3 ? " + (preis1 == preis3));
        IO.println("Preis1 != Preis2 ? " + (preis1 != preis2));

    }
}
