class  Operator{
//!(logical not) It negates the result of the evaluation
System.out.println(!(3<10)); // True but note that (3>7) returns false

//bitwise exclusive OR
System.out.println((0)^(1)); //if one or the other of the operands is true but not both
// bitwise exclusive OR
System.out.println((3>12)^(2>7));
// bitwise inclusive OR
System.out.println((3>2)|(2>7)) // either op1 or op2 is true, always evaluates op1 and op2
// Bitwise Operator
System.out.println((13>>2)); // 13=1101 in binary Shifts 2 bits to the right becomes 11 which is 3
System.out.println((13>>>2)); // 13=1101 in binary Shifts 2 bits to the right becomes 11 which is 3
System.out.println((78>>3)); // 78=1001110 in binary Shifts 3 bits to the right becomes 1001 which is 9 decimal
System.out.println((13<<2)) // 13=1101 in binary Shifts 3 bits to the left becomes 1101000 which is....
System.out.println((78<<3)) // 78=1001110 in binary Shifts 3 bits to the left becomes 1001110000 which is ............

// postfix and prefix operators ++ and --

int c = 2, d = 6

System.out.println(c++); // this statement displays 2 then, only c incremented by 1 to 3.
System.out.println(d++); // this statement displays 6 then, only d incremented by 1 to 7.
System.out.println(++c); // this statement increments 1 to c then, only c is displayed
Sytem.out.println(++d); // //this statement increments 1 to d then, only c is displayed
}
}