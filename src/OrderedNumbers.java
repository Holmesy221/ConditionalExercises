import java.util.Scanner;

public class OrderedNumbers {


    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();

        if(num2 > num1 && num3 > num2){
            System.out.println("The numbers are increasing");
        }else if (num2 < num1 && num3 < num2){
            System.out.println("The numbers are decreasing");
        }else{
            System.out.println("The numbers are neither increasing or decreasing");
        }



    }




}
