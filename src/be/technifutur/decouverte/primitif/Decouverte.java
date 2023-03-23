package be.technifutur.decouverte.primitif;

public class Decouverte {

    public static void main(String[] args) {
        // boolean
        testboolean();
        // entier signé
        testByte();
        testShort();
        testInteger();
        testLong();
        // caractère
        testChar();
        // numétiques flottants
        testFloat();
        testDouble();
    }

    private static void testDouble() {
        double test = 5.3;
        System.out.println("division par 0 : "+(test/0));
        System.out.println("division par 0 : "+(0.0/0.0));

        test = Long.MAX_VALUE;
        for (int i = 0; i < 200; i++) {
            test -= 1000;
            long l = (long)test;
            System.out.printf("double : %s long : $s $n", test,l);
        }
    }

    private static void testFloat() {
        float test = 5.3f;
    }

    private static void testChar() {
        char car = 'r';
        char car2 = 'a';
        int res = car + car2;
        car = '\n';
    }

    private static void testLong() {
        long test = Long.MAX_VALUE; // milliard de milliard
        test = 9_223_372_036_854_775_807L;
        int val = 5;
        test = test - val; // long - int => long - long
    }

    private static void testInteger() {
        int test = Integer.MIN_VALUE; // -2.000.000.000 - 2.000.000.000
        int test2 = 3; // 2 est un int

        test = test / test2; // DIV
        test = test % test2; // mod

        test = 0b00110; // 6
        System.out.println("0b00110 = "+test);
        System.out.println("test & test2 = "+(test & test2)); // 2
        System.out.println("test | test2 = "+(test | test2)); // 7
        System.out.println("test ^ test2 = "+(test ^ test2)); // 5
        System.out.println("~test = "+(~test+1)); // -7+1

        System.out.println("test << 2 = "+(test << 2));
        System.out.println("test >> 2 = "+(test >> 2));
        System.out.println("test >>> 2 = "+(test >>> 2));

        test = -6;
        System.out.println("test << 2 = "+(test << 2));
        System.out.println("test >> 2 = "+(test >> 2));
        System.out.println("test >>> 2 = "+(test >>> 2));

        System.out.println(Integer.toBinaryString(test+7));
    }

    private static void testShort() {
        short test = Short.MIN_VALUE; // -30000 à +30000 environ
        short test2 = 2;
        int i = test2;
        // test = i;
        test = (short) i;
        test = (short)(test + test2);
        test+= test2; // test = (short)(test + test2)
    }

    private static void testByte() {
        byte test = Byte.MIN_VALUE; // -100 à +100 environ
        byte test2 = 2;
        int i = test2;
        // test = i;
        test = (byte)i;
        test = (byte)(test + test2);
        test+= test2; // test = (byte)(test + test2)
    }

    private static void testboolean(){
        boolean test = true;
        boolean test2 = true;
        test = false;
        // int i = test;
        // int i = (int)test;
        // test = 0;

        test = ! test; // not
        test = test & test2; // et évaluation longue
        test = test && test2; // et evaluation courte
        test = test | test2; // et évaluation longue
        test = test || test2; // et évaluation courte

        test &= test2; // test = test & test2
        test |= test2; // test = test | test2
        test ^= test2; // test = test ^ test2

        Boolean object = Boolean.TRUE;
        test = object; // unboxing
        test = object.booleanValue();
        object = test; // auto boxing
        object = Boolean.valueOf(test); // boxing

        if (test == false) {
            System.out.println("false");
        }
        else {
            System.out.println("true");
        }


    }


}
