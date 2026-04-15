
public class App {
    static void main() {

        // Husky erstellen, der von Hund erbt
        Husky meinHusky = new Husky("Bello", 7, true);

        IO.println(meinHusky.info());

        // Pudel erstellen
        Pudel meinPudel = new Pudel("Fiffi", 2, true);
        IO.println(meinPudel.info());




    }
}