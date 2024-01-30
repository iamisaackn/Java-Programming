import javax.swing.JOptionPane;

public class IfExample{
    public static void main(String[] args) {
        String input;
        int age;

        input = JOptionPane.showInputDialog("What is your age? ");
        age = Integer.parseInt(input);

        if(age>18){
            System.out.println(age + ", you qualify as an adult.");
        }
    }
}