public class LogischeOperatoren {
    static void main() {
        boolean istEingeloggt  = true;
        boolean hatGutschein = false;

        IO.println("UND: Kunde ist eingelogt und hat Gutschein: " + (istEingeloggt && hatGutschein));
        IO.println("ODER: Kunde  ist eingelogt und hat Gutschein: " +  (istEingeloggt || hatGutschein));
        IO.println("Negierung: " + (!istEingeloggt));

        int alter = 19;
        boolean kannProduktKaufen = istEingeloggt && hatGutschein && alter >= 18;

        IO.println("Kunde kann Produkt kaufen: " + (kannProduktKaufen));

    }


}
