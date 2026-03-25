public class BMIRechner {
    static void main() {
        // ---------------------------------------------------------
        // Aufgabe 3: BMI-Rechner
        // Lies ein:
        // - Gewicht (kg)
        // - Größe (m)
        // Berechne den BMI:
        // BMI = Gewicht / (Größe²)
        // ---------------------------------------------------------

        double gewicht = Double.parseDouble(IO.readln("Gewicht: "));
        double größe = Double.parseDouble(IO.readln("Größe: "));

        double BMI = gewicht / (größe * größe);

        IO.println(String.format("BMI: %.2f" , BMI));
    }
}
