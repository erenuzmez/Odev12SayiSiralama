package BKosulluIfadeler;
import java.util.Scanner;
public class Odev12SayiSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.println("a sayısını giriniz:");
        a = input.nextInt();
        System.out.println("b sayısını giriniz:");
        b = input.nextInt();
        System.out.println("c sayısını giriniz:");
        c = input.nextInt();
        if (a < b && a < c) {
            if (b < c) {
                System.out.println("Küçükten büyüğe sıralama\na<b<c");
            } else {
                System.out.println("Küçükten büyüğe sıralama\na<c<b");
            }
        }
        if (b < a && b < c) {
            if (a < c) {
                System.out.println("Küçükten büyüğe sıralama\nb<a<c");
            } else {
                System.out.println("Küçükten büyüğe sıralama\nb<c<a");
            }
        }
        if (c < a && c < b) {
            if (a < b) {
                System.out.println("Küçükten büyüğe sıralama\nc<a<b");
            } else {
                System.out.println("Küçükten büyüğe sıralama\nc<b<a");
            }
        }
    }
}
