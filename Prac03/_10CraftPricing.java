import javax.swing.*;

public class _10CraftPricing {

    public static void main (String[] args){
        String name = JOptionPane.showInputDialog("Name of product: ");

        String stringCost = JOptionPane.showInputDialog("Cost of materials: ");
        double cost = Double.parseDouble(stringCost);

        String stringHours = JOptionPane.showInputDialog("Hours of work: ");
        double hours = Double.parseDouble(stringHours);

        double retailPrice = calculateRetailPrice(cost, hours);

        JOptionPane.showMessageDialog(null, "Product name: " + name +
                "\nRetail price: $" + String.format("%.2f", retailPrice), "Retail Price",
        JOptionPane.INFORMATION_MESSAGE);
    }

    private static double calculateRetailPrice(double cost, double hours){
        return (((cost + 12) * hours) + 7);
    }
}
