public class GroessterGemeinsamerTeiler {
    static void main() {

    int m = Integer.parseInt(IO.readln("m: "));
    int n = Integer.parseInt(IO.readln("n: "));
    int r = m % n;

    while (r > 0) {
        m = n;
        n = r;
        r = m % n;
    }
        IO.println("n = " + n);

    }
}
