public class TemperaturRechner {
    static void main() {
        // ---------------------------------------------------------
        // Aufgabe 2: Temperaturrechner
        // Lies eine Temperatur in Celsius ein und wandle sie
        // in Fahrenheit um.
        // Formel: F = C * 1.8 + 32
        // ---------------------------------------------------------

        int celsius = Integer.parseInt(IO.readln( "C° eingeben: " ));

        double fahrenheit = celsius * 1.8 + 32;
        IO.println("Fahrenheit =  " + fahrenheit);

    }
}
