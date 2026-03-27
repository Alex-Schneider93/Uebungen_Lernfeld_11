public class StringDemonstration {
    static void main() {
        // String erstellen
        String name =""; // initialisierung mit leerem Text
        name = "Raphaela";
        IO.println(name);

        //Deklaration und Initialisierung in eine Zeile
        String name2 ="Henning";
        // Länge
        int namensLänge = name.length();
        IO.println("Lähge des Namens: " +namensLänge );

        // _Strtings vergleichen
        boolean nameIstGleich = name.equals("Raphaela");
        IO.println("Namen sind gleich: "+ nameIstGleich);

        // alles klein oder groß schreiben
        IO.println(name.toLowerCase());
        IO.println(name.toUpperCase());

    }
}
