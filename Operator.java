class Operator {
    public static void main(String[] args) {
        // Logical NOT operator (!) returns the inverse of the boolean value of the condition
        System.out.println(!(3<10)); // Evaluates to false because 3 is less than 10

        // Bitwise XOR operator (^) returns true if exactly one of the operands is true
        System.out.println((0)^(1)); // Evaluates to true because only one operand is true (1)
        System.out.println((3>12)^(2>7)); // Evaluates to false because both conditions are false

        // Bitwise OR operator (|) returns true if at least one of the operands is true
        System.out.println((3>2)|(2>7)); // Evaluates to true because the first condition is true (3>2)

        // Right shift operator (>>) shifts the bits of the number to the right and fills 0 on voids left as a result
        System.out.println((13>>2)); // 13 in binary is 1101, shifting right by 2 bits results in 11 which is 3 in decimal
        System.out.println((78>>3)); // 78 in binary is 1001110, shifting right by 3 bits results in 1001 which is 9 in decimal

        // Left shift operator (<<) shifts the bits of the number to the left and fills 0 on voids right as a result
        System.out.println((13<<2)); // 13 in binary is 1101, shifting left by 2 bits results in 110100 which is 52 in decimal
        System.out.println((78<<3)); // 78 in binary is 1001110, shifting left by 3 bits results in 1001110000 which is 624 in decimal

        // Postfix increment operator (c++) increments the value of c after the current expression is evaluated
        int c = 2;
        System.out.println(c++); // Displays 2, then increments c by 1 to 3

        // Prefix increment operator (++d) increments the value of d before the current expression is evaluated
        int d = 6;
        System.out.println(++d); // Increments d by 1 to 7, then displays 7
    }
}
