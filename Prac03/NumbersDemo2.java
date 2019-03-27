import java.util.Scanner;

public class NumbersDemo2 {

    public static void displayTwiceTheNumber(int num){
        System.out.println("Twice the number is: " + (num*2));
    }

    public static void displayNumberPlusFive(int num) {
        System.out.println("Number plus five is: " + (num + 5));
    }

    public static void displayNumberSquared(int num){
        System.out.println("Number squared is: " + (num*num));
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        String stringFirstNum = input.nextLine();
        int firstNum = Integer.parseInt(stringFirstNum);

        System.out.println("Enter second number: ");
        String stringSecondNum = input.nextLine();
        int secondNum = Integer.parseInt(stringSecondNum);

        System.out.println("\nNumber: " + firstNum);
        displayTwiceTheNumber(firstNum);
        displayNumberPlusFive(firstNum);
        displayNumberSquared(firstNum);

        System.out.println("\nNumber: " + secondNum);
        displayTwiceTheNumber(secondNum);
        displayNumberPlusFive(secondNum);
        displayNumberSquared(secondNum);
    }

}
