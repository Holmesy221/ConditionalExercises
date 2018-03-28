import java.util.Scanner;

public class FiveNumbersSumAverage {


    public static void main(String args[]) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five numbers: ");
        double average;
        int sum = 0;
        int nums;

        for (int i = 0; i < 5; i++) {
             nums = scanner.nextInt();

            sum+=nums;
        }

         average = sum/5;
        System.out.println("the sum = " + sum + " the average = " + average);

    }




}
