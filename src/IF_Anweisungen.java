public class IF_Anweisungen {
    static void main() {
        double temperatur = 40;
        // Einfache Bedingung

      /*  if (temperatur > 30) {
            IO.println("Ganz schön heiß!");
        } else {
            IO.println("Mann kann noch aushalten");
        } */

        if (temperatur > 30) {
            IO.println("Ganz schön heiß!");
        } else if (temperatur > 20) {
            IO.println("T-Shirt Wetter");
        }else {
            IO.println("Es ist kalt!");
        }

        // Logische Operatoren

        boolean istOnline = false;
        boolean hatGuthaben = false;

        if (istOnline && hatGuthaben) {
            IO.println("Viel Spaß beim Shopen");

        } else if (istOnline) {
            IO.println("Du brauchst Guthaben");

        }else if (hatGuthaben) {
            IO.println("Melde dich an");
        }else {
            IO.println("Bist du überhaupt kunde?");
        }

    }
}
