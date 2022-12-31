package ir.porteghali.java;

public class E29_LogicalOperators {
    public void Start () {
        System.out.println("LogicalOperators");
        /*
        &&  AND
        ||  OR
        !   NOT
        |   OR
        &   AND
        ^   xor

         */

        int a = 10;
        int b = 21;
        int c = 1;
        int d = 5;
        boolean e = true ;

        System.out.println(
                (a < b)
                        &&
                        (d > c)
        );

        System.out.println(
                (a<b)
                        &&
                        (d<c)
        );

        System.out.println(
                (a<b)
                        &&
                        !(d<c)
        );

        System.out.println(
                (a>b)
                        ||
                        (d<c)
        );

        System.out.println(
                (a>b)
                        ||
                        (d<c)
                ||
                        e
        );
    }
}
