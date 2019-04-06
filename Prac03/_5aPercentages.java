public class _5aPercentages {

    public static void main(String[] args){
        double num1 = 2.5;
        double num2 = 5.0;

        computePercent(num1, num2);
        computePercent(num2, num1);
    }

    public static void computePercent(double num1, double num2){
        double percent = num1 * 100/num2;
        System.out.println(num1 + " is " + String.format("%.2f", percent) + " percent of " + num2);

    }
}
