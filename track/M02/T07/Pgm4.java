
import java.util.Scanner;

class Pgm4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the Array Elements:");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Elements are:");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i] + " ");
        }

        int max = arr[0];
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max Element is: " + max);

    }
}
