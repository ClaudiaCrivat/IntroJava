public class Operatori {
    public static void main(String[] args) {
        /*Operatori:
        aritmetici : +,-,*,/,&
        de comparare: <,>, ==, !=, >=, <=
        logici: &&, ||, !
         */

        int a = 3; //declarare && initializare
        int b = 5;
        a = b; //suprascriere
        System.out.println(a + b);
        System.out.println(a / b);
        System.out.println(11 % b);
        System.out.println(a != b);
        System.out.println(7>b && 5<b); // 7>5 SI 5<5?
        System.out.println(7>b || 5<b); // 7>5 SAU 5<5?
        System.out.println(7>b || (2>b || 3> b)); // true ||false




    }
}
