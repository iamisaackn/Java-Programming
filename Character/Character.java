public class Character {

    public static char isLetter{

    }

    public static void main(String args[]) {

        //isLetter()
        System.out.println(Character.isLetter('c'));
        System.out.println(Character.isLetter('C'));

        //isDigit()
        System.out.println(Character.isDigit('c'));
        System.out.println(Character.isDigit('5'));

        //isWhitespace()
        System.out.println(Character.isWhitespace('c'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isWhitespace('\n'));
        System.out.println(Character.isWhitespace('\t'));

        //isUppercase()
        System.out.println(Character.isUppercase('c'));
        System.out.println(Character.toUppercase('c'));

        //isLowercase()
        System.out.println(Character.isLowercase('C'));
        System.out.println(Character.toLowercase('C'));

        //toString()
        System.out.println(Character.toSting('c'));
        System.out.println(Character.toString('C'));
    }// End of main
} // End of Class