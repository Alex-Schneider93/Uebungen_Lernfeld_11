public class Kapitalverdoppelung {
    static void main() {

        double startkapital = Double.parseDouble(IO.readln("Startkapital: "));
        double zinssatz = Double.parseDouble(IO.readln("Zinssatz: "));

        int jahr = 0;
        double kapital = startkapital;

        do {
            kapital = kapital * (1 + zinssatz / 100);
            jahr++;
        }while (kapital < 2 * startkapital);
        IO.println(String.format("Verdoppelte Kapital: %.2f " ,kapital));
        IO.println("Kapitalverdoppelung nach " + jahr + " Jahren");

    }
}

