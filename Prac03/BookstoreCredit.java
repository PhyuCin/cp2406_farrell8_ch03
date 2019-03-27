import java.util.Scanner;

public class BookstoreCredit {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Your name: ");
        String name = input.nextLine();

        System.out.println("Your GPA: ");
        String stringGPA = input.nextLine();
        double GPA = Double.parseDouble(stringGPA);

        double credit = GPA * 10;

        System.out.println(name + " with a GPA of " + GPA + " has $" +
                String.format("%.2f" ,credit) + " bookstore credits.");

    }

}
