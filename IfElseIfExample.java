import javax.swing.JOptionPane;

public class IfElseIfExample {
    public static void main(String[] args){
        int marks;
        String input;

        // Input marks
        input = JOptionPane.showInputDialog("Input marks: ");
        marks = Integer.parseInt(input);

        // If Else If Statement
        if(marks < 50){
            System.out.println("Fail: " + marks);
        } else if(50<=marks && marks<60 ) {
            System.out.println("Grade D: " + marks);
        } else if(60<=marks && marks<70) {
            System.out.println("Grade C: " + marks);
        } else if(70<=marks && marks<80) {
            System.out.println("Grade B: " + marks);
        } else if(80<=marks && marks<90) {
            System.out.println("Grade A: " + marks);
        } else if(90<=marks && marks<100){
            System.out.println("Grade A+: " + marks);
        } else {
            System.out.println("Input invalid");
        }
        
    }
}
