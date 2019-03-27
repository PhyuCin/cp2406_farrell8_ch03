import java.util.Scanner;

public class Percentages2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("First number: ");
        String stringNum1 = input.nextLine();
        System.out.println("Second number: ");
        String stringNum2 = input.nextLine();

        double num1 = Double.parseDouble(stringNum1);
        double num2 = Double.parseDouble(stringNum2);

        computePercent(num1, num2);
        computePercent(num2, num1);
    }

    public static void computePercent(double num1, double num2){
        double percent = num1 * 100/num2;
        System.out.println(num1 + " is " + String.format("%.2f", percent) + " percent of " + num2);

    }
}

