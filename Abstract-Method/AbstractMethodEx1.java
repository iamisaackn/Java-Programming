abstract class Multiply {
    
    public abstract int MultiplyTwo(int num1, int num2);
    public abstract int MultiplyThree(int num1, int num2, int num3);

    public void show(){
        System.out.println("Method of abstract class multiply");
    }
}

class AbstractMethodEx1 extends Multiply {

    public int MultiplyTwo(int num1, int num2){
        return num1 * num2;
    }

    public int MultiplyThree(int num1, int num2, int num3){
        return num1 * num2 * num3;
    }

    public static void main(String[] args) {
        Multiply obj = new AbstractMethodEx1();

        System.out.println("Multiplication of 2 numbers: " + obj.MultiplyTwo(10, 15));
        System.out.println("Multiplication of 3 numbers: " + obj.MultiplyThree(5, 8, 10));

        obj.show();
    }
}