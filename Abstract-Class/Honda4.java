abstract class Bike{
    abstract void run(); // creating an abstract method
}

class Honda4 extends Bike{
    void run(){
        System.out.println("running safely");
    }

    public static void main (String args[]) {
        Bike obj = new Honda4(); // creating an object 'obj'
        obj.run(); // calling run()
    }
}

