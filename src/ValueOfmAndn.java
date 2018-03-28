import java.util.Scanner;

public class ValueOfmAndn {


    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num = scanner.nextInt();

        System.out.println("The value of m = " + num);
        if(num > 0){
            System.out.println("The value of n " + 1);
        }else if(num == 0){
            System.out.println("The value of n " + 0);
        }else {
            System.out.println("The value of n " + -1);
        }




    }


}
