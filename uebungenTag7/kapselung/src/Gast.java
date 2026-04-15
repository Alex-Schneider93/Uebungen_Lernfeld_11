public class Gast extends User {
    int tageGueltig ;
    public Gast(String name, int tageGueltig) {
        super (name);
        this.tageGueltig = tageGueltig;
    }

    public String ausgabe(){
        return super.ausgabe() + " Tage Gültig: " +  tageGueltig;
    }
}
