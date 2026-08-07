import java.util.Scanner;
public class UserInput2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ur age:");
        int age = sc.nextInt();
        System.out.println("Age is: "+age);
        System.out.println("Enter your height:");
        float height = sc.nextFloat();
        System.out.println("Your Height: "+height);
        sc.nextLine();
        System.out.println("Enter your full name:");
        String fname = sc.nextLine();
        System.out.println("Full Name is:"+fname);
        
    }
}