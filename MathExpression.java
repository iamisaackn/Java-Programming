public class MathExpression {
    public static void main(String[] args) {

        // System.out.println(30+= 70);
        int a = 30;
         a += 70;
         System.out.println("Value of a: " + a);

        // System.out.println(10*=3);
        int b = 10;
        b *= 3;
        System.out.println("Value of b: " + b);

        // System.out.println(50/= 2)
        int c = 50;
        c /= 2;
        System.out.println("Value of c: " + c);

        // System.out.println(45%= 7)
        int d = 45;
        d %= 7;
        System.out.println("Value of d: " + d);

        // System.out.println(13<3 & 40<100)
        boolean e = 13<3 & 40<100;
        System.out.println("Value of e: " + e);

        // System.out.println(13<3 | 40<100)
        boolean f = (13<3 | 40<100);
        System.out.println("The value of f: " + f);

        // System.out.println(13<3 && 40<100)
        boolean g = (13<3 && 40<100);
        System.out.println("The value of g: " + g);

        // System.out.println(13<3 || 40<100)
        boolean h = (13<3 || 40<100);
        System.out.println("Value of h: " + h);

        // System.out.println(((13<<3)<100))
        boolean i = ((13<<3) < 100);
        System.out.println("Value of i: " + i);

        // System.out.println(Math.pow((13>>2),3))
        double j = Math.pow((13>>2), 3);
        System.out.println("Value of j: " + j);

        // System.out.println((Math.pow((13>>2),3)<100))
        boolean k = (Math.pow((13 >> 2), 3) < 100);
        System.out.println("Value of k: " + k);

        // System.out.println(x++)
        int l = 15;
        l++;
        System.out.println("Answer: " + l);

        // System.out.println(++x)
        int m = 15;
        ++m;
        System.out.println("Answer: " + m);

        // System.out.println(x--)
        int n = 15;
        n--;
        System.out.println("Answer: " + n);

        // System.out.println(--x)
        int o = 15;
        --o;
        System.out.println("Answer: " + o);

        // System.out.println(x%=7)
        int p = 15;
        p %= 7;
        System.out.println("Answer: " + p);

        // System.out.println(225%x)
        int q = 225 % 15;
        System.out.println("Answer: " + q);

        // System.out.println(x>>=2)
        int r = 15;
        r >>= 2;
        System.out.println("Answer: " + r);

        // System.out.println(x>>>=2)
        int s = 15;
        s >>>= 2;
        System.out.println("Answer: " + s);

        // System.out.println(Math.pow((x>>=2),3))
        int t = 15;
        Math.pow((t >>= 2), 3);
        System.out.println("Answer: " + t);



    }
    
}
