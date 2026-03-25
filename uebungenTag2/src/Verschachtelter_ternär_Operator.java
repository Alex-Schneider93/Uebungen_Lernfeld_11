public class Verschachtelter_ternär_Operator {
    static void main() {
        /*
        Extra Aufgabe 2: Verschachtelter ternärer Operator
        Gegeben ist eine Variable temperatur (int).
        Weise einer String-Variable beschreibung eine von
        drei Beschreibungen zu:
        unter 0: "Eiskalt"
        zwischen 0 und 20 (inklusive): "Kühl"
        über 20: "Warm"
        Nutze dafür einen verschachtelten ternären Operator.
        int temperatur= 15;

         */

        int temperatur = 15;

        String beschreibung = temperatur < 0 ? "Eiskalt" : (temperatur <= 20 ? "Kühl" : "Warm");
        IO.println(beschreibung);

    }
}
