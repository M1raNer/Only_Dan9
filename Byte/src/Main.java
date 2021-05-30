package Roma1;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число в десятичной системе: ");
        int b = input.nextInt();
        int[] Array = new int[100];
        int i = 0;
        while (b!=0){
            Array[i]=b%2;
            b=b/2;
            i++;
        }
        System.out.println("В двоичной системе: ");
        for (int j =i-1;j>=0;j--){
            System.out.print(Array[j]);
        }


    }
}
