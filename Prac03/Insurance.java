import javax.swing.*;

public class Insurance {

    public static void main(String[] args){
        String stringCurrentYear = JOptionPane.showInputDialog("Current year:");
        int currentYear = Integer.parseInt(stringCurrentYear);

        String stringBirthYear = JOptionPane.showInputDialog("Birth year:");
        int birthYear = Integer.parseInt(stringBirthYear);

        double premiumAmount = getPremiumAmount(currentYear, birthYear);
        JOptionPane.showMessageDialog(null, "Your premium fees: $" + premiumAmount,
                "Premium Amount",
                JOptionPane.INFORMATION_MESSAGE);

    }

    public static double getPremiumAmount(int currentYear, int birthYear){
        double age = currentYear - birthYear;
        double decade = Math.floor(age / 10);
        return ((decade + 15)*20);
    }
}


