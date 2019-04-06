import java.util.Scanner;

public class _8PaintCalculator {
    static final int SQFEETPERGALLON = 350;
    static final int PRICEPERGALLON = 32;

    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        System.out.println("Length: ");
        String stringLength = input.nextLine();
        int length = Integer.parseInt(stringLength);

        System.out.println("Width: ");
        String stringWidth = input.nextLine();
        int width =Integer.parseInt(stringWidth);

        System.out.println("Height: ");
        String stringHeight = input.nextLine();
        int height = Integer.parseInt(stringHeight);

        double finalPrice = getPaintPrice(length, width, height);
        System.out.println("The cost to paint a " + length + "-by-" + width + "foot room with a " +
                height + "-foot ceiling is $" + String.format("%.2f", finalPrice));

    }

    public static double getPaintPrice(int l, int w, int h){
        int area = ((l*h*2) + (w*h*2));
        double gallons = gallonsNeeded(area);
        System.out.println("Gallons needed: " + String.format("%.2f", gallons));

        if (gallons % 1 == 0){
            return gallons * PRICEPERGALLON;
        }
        else{
            return (Math.floor(gallons) *PRICEPERGALLON) + PRICEPERGALLON;
        }

    }

    public static double gallonsNeeded(double area){
        return area / 350;
    }
}
