import javax.swing.JOptionPane;

public class IfElseExample {

    public static void main(String[] args) {
        int number;
        String input;

        // Input number
        input = JOptionPane.showInputDialog("Input a number: ");
        number = Integer.parseInt(input);

        // If Else Condition
        if(number % 2 == 0){
            System.out.println(number + ", is an even number");
        } else {
            System.out.println(number + ", is an odd number");
        }

    }
}
