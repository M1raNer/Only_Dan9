package Roma;
import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");

        int size = input.nextInt();
        int[] a = new int[size];
        System.out.println("Введите обьекты массива: ");

        for (int i = 0; i < a.length; i++ ) {
            a[i] = input.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("Обьекты массива: " + a[i]);
        }

        for (int i = 0; i < a.length; i++) {
            int min = a.length;
            int IndexMin = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min){
                    min = a[j];
                    IndexMin = j;
                }
            }
            if (i != IndexMin) {
                int tmp = a[i];
                a[i] = a[IndexMin];
                a[IndexMin] = tmp;
            }
            System.out.println(a[i]);
        }
    }
}
