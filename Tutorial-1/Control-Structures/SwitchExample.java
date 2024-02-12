import javax.swing.JOptionPane;

public class SwitchExample {
    
    public static void main(String[] args) {
        int number;
        String input;

        // Input number
        input = JOptionPane.showInputDialog("Enter a number btwn 20, 30, 40, 50: ");
        number = Integer.parseInt(input);

        switch(number) {
            case 20: System.out.println("Choosen number 20");
            break;
            case 30: System.out.println("Choosen number 30");
            break;
            case 40: System.out.println("Choosen number 40");
            break;
            case 50: System.out.println("Choosen number 50");
            break;
            default: System.out.println("Not among 20, 30, 40, 50");
        }
    }
}
