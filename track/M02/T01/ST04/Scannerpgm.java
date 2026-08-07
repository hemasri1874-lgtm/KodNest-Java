
import java.util.Scanner;

class Scannerpgm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter byte value: ");
        byte a = sc.nextByte();
        System.out.println("Byte Value: " + a);

        System.out.println("Enter short value: ");
        short b = sc.nextShort();
        System.out.println("Short Value:  " + b);

        System.out.println("Enter integer value: ");
        int c = sc.nextInt();
        System.out.println("Integer Value: " + c);

        System.out.println("Enter Long value: ");
        long d = sc.nextInt();
        System.out.println("Long Value: " + d);

        System.out.println("Enter float value: ");
        float e = sc.nextFloat();
        System.out.println("Float Value: " + e);

        System.out.println("Enter double value:");
        double f = sc.nextDouble();
        System.out.println("Double Value:" + f);

        System.out.println("Enter boolean value: ");
        boolean g = sc.nextBoolean();
        System.out.println("Boolean Value:" + g);

    }
}
