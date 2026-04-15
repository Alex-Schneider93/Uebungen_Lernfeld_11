public class Gast extends User {
    int tageGueltig ;
    public Gast(String name, int tageGueltig) {
        super (name);
        this.tageGueltig = tageGueltig;
    }

    @Override
    public String toString(){
        return super.toString() + ", Tage Gültig: " + tageGueltig;
    }

}

  //  public String ausgabe(){
   //     return super.ausgabe() + " Tage Gültig: " +  tageGueltig;
   // }







