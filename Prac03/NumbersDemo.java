public class NumbersDemo {

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
        int firstNum = 2;
        int secondNum = 3;

        System.out.println("The number is: " + firstNum);
        displayTwiceTheNumber(firstNum);
        displayNumberPlusFive(firstNum);
        displayNumberSquared(firstNum);

        System.out.println("\nThe number is: " + secondNum);
        displayTwiceTheNumber(secondNum);
        displayNumberPlusFive(secondNum);
        displayNumberSquared(secondNum);
    }


}
