import java.util.Scanner;

public class MetricConversion {
    static final double CMININCH = 2.54;
    static final double LINGALLON = 3.7854;


    public static void inchToCm(int num){
        double cm = num * CMININCH;
        System.out.println("There are " + cm + "cm in " + num + " inches.");
    }

    public static void gallonToL(int num){
        double liters = num * LINGALLON;
        System.out.println("There are " + liters + " liters in " + num + " gallons.");
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String stringNum = input.nextLine();

        int num = Integer.parseInt(stringNum);
        inchToCm(num);
        gallonToL(num);
    }


}
