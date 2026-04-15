public class Moderator extends User {

    boolean istModerator;

    public Moderator(String name, int beitraege, boolean istModerator) {
        super(name, beitraege);
        this.istModerator = istModerator;

    }

   // public String ausgabe() {
   //     return super.ausgabe() + " Ist Moderator? " + istModerator;
  //  }

    @Override
    public String toString() {
        return  super.toString() + ", Ist Moderator?  " +  istModerator;
    }


}