public class Einfacher_Ternär_Operator {
    static void main() {
        /*
        Extra Aufgabe 1: Einfacher ternärer Operator
        Lege eine Variable zahl an. Weise einer String-Variable paritaet zu,
        ob die Zahl gerade oder
        ungerade ist -- mit dem ternären Operator
         */
        int zahl = 7;

      String paritaet = zahl % 2 == 0 ? "gerade" : "ungerade";
      System.out.println(paritaet);

    }
}

