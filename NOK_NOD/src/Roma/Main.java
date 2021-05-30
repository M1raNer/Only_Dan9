package Roma;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        int a, b;
        a = 39;
        b = 65;
        int c, d;

        c = a;
        d = b;
        while (a != 0 && b != 0) {
            if (a > b)
                a = a % b;
            else
                b = b % a;
        }
        int NOD;
        NOD = a + b;
        int NOK = ((c * d) / (NOD));
        System.out.println("NOD: " + NOD);
        System.out.println("NOK: " + NOK);
    }
}
