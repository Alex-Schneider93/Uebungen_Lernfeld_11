public class switch_Anweisung {
    static void main() {
        /*
        Aufgabe 4: switch-Anweisung
        Schreibe ein Programm mit einer Variable tag (int von 1 bis 7).
        Gib den Wochentag als Text aus
        (1 = Montag, ..., 7 = Sonntag). Nutze eine switch-Anweisung.
        int tag = 4;
        switch-Anweisung für Wochentag*/

        int tag =4;

        switch (tag) {
            case 1:
                IO.println("Montag");
                break;
            case 2:
                IO.println("Dienstag");
                break;
            case 3:
                IO.println("Mittwoch");
                break;
            case 4:
                IO.println("Donnerstag");
                break;
            case 5:
                IO.println("Freitag");
                break;
            case 6:
                IO.println("Samstag");
                break;
            case 7:
                IO.println("Sonntag");
                break;
            default:
                IO.println("Ungültiger Tag");
                break;
        }
    }
}
