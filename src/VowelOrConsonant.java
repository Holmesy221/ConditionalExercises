import java.util.Scanner;

public class VowelOrConsonant {


    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String letter = scanner.nextLine();

        if(letter.equalsIgnoreCase("a") | letter.equalsIgnoreCase("e")
                | letter.equalsIgnoreCase("i") | letter.equalsIgnoreCase("o")
                | letter.equalsIgnoreCase("u")){
            System.out.println("The letter is a vowel");
        }else{
            System.out.println("The letter is a consonant");
        }


    }


}
