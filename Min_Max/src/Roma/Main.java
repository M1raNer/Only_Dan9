package Roma;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int s = input.nextInt();
        int [] a = new int[s];
        System.out.print("Введите значение массива:");
        for (int i = 0; i < s; i++) {
            a[i] = input.nextInt();
        }
        System.out.println("Обьекты массива:");
        for (int i = 0; i < s; i++) {
            System.out.println(" " + a[i]);
        }
        int max = Integer.MIN_VALUE;
        int IndexMax = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] > max){
                max = a[i];
                IndexMax = i;
            }
        }
        int pred_max = Integer.MIN_VALUE;
        int IndexPredMax = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] > pred_max && a[i] != max){
                pred_max = a[i];
                IndexPredMax = i;
            }
        }
        int min = Integer.MAX_VALUE;
        int IndexMin = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] < min){
                min = a[i];
                IndexMin = i;
            }
        }
        int pred_min = Integer.MAX_VALUE;
        int IndexPredMin = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] < pred_min && a[i] != min){
                pred_min = a[i];
                IndexPredMin = i;
            }
        }
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Индекс максимального элемента: " + IndexMax);
        System.out.println("Предмаксимальный элемент: " + pred_max);
        System.out.println("Индекс предмаксимального элемента: " + IndexPredMax);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Индекс минимального элемента: " + IndexMin);
        System.out.println("Постминимальный элемент: " + pred_min);
        System.out.println("Индекс постминимального элемента: " + IndexPredMin);

    }


}