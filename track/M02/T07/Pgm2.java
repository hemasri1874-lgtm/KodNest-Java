
import java.util.Scanner;

class Pgm2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.print("Enter Array Elements: ");
        for (int i = a.length - 1; i >= 0; i--) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array Elements are: ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }

    }
}
