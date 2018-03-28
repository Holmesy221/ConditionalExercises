import java.util.Scanner;

public class WeekDay {

    public static void main(String args[]) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number 1-7: ");
        int number = scanner.nextInt();

        String day;
        switch (number){
            case 1: day = "monday";
            break;
            case 2: day = "tuesday";
            break;
            case 3: day = "wednesday";
            break;
            case 4: day = "thursday";
            break;
            case 5: day = "friday";
            break;
            case 6: day = "Saturday";
            break;
            case 7: day = "sunday";
            break;
            default: day = "Not in range";

        }

        System.out.println(day);


    }



}
