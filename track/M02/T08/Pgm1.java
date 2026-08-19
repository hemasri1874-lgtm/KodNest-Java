import java.util.Scanner;
class Pgm1{
    public static void main(String[] args){
        int arr[][] = new int[3][5] ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements: ");
        for(int i=0;i<=2;i++){
            for(int j=0;j<=4;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array Elements are: ");
        for(int i=0;i<=2;i++){
            for(int j=0;j<=4;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}