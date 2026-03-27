import javax.swing.*;

public class InUndOutput {
    static void main() {

        // Output
        IO.println("Hier ist meine Ausgabe");

        JOptionPane.showMessageDialog(null, "Hier ist meine JOP Ausgabe");
        // Input
        String userName = IO.readln("Gib dinen Namen ein: ");
        IO.println("Der Name ist :" + userName);

        int alter = Integer.parseInt(IO.readln( userName + ", Dein Alter ist : "));

        IO.println(userName+ ", Dein Alter ist : " + alter);


        String jOptionName = JOptionPane.showInputDialog(("Gib den Kontostand ein: "));
        JOptionPane.showMessageDialog(null, "Der Kontostand ist: " + jOptionName);
    }
}
