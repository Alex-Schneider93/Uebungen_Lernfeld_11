public class Main {
    public static void main(String[] args) {
      //  Moderator moderator1 = new Moderator("Alex", 20, true);
      //  IO.println(moderator1.ausgabe());

       // moderator1.setName("Tomm");
      //  moderator1.setBeiträge(19);
      //  IO.println(moderator1.ausgabe());

        Gast gast = new Gast("Quang", 15);
        IO.println(gast);


    //    Moderator moderator2 = new Moderator("Florian", 150, false);
       //IO.println(moderator2.ausgabe());
    //    IO.println(moderator2);
      //  moderator2.setBeiträge(-100);

       // Gast gast2 = new Gast("Tobias", 20);
        // IO.println(gast2.ausgabe());

        Moderator moderator3 = new Moderator("Bern", 20, false);
        IO.println(moderator3);


        Gast gast2 = new Gast("Tomm", 9);
        IO.println(gast2);

        IO.println("Anzahl Users: " + User.getUserZaehler());

    }
}