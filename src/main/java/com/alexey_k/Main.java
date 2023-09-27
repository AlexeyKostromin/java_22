package com.alexey_k;

public class Main {


    public static void main(String[] args) {
        byte aByte1 = 100;
        byte aByte2 = 127;
        int aIntMin = Integer.MIN_VALUE;
        int aIntMax = Integer.MAX_VALUE;
        int aInt1 = 10000;
        int aInt2 = 20000;
        float aFloat1 = 0.02f;
        double aDouble = 1.0;
        char aChar1 = 's';

        byte aInt3= (byte)aIntMin;
        System.out.println("Cast int to byte:" + aInt3);//0

        System.out.println("Overflow byte:" + (byte) (aByte1 + aByte2));//-29
        System.out.println("Overflow int:" + (aIntMin * aIntMax));//-2147483648
        System.out.println("Cast int to short:" +  (short) (aInt1 * aInt2));//-15872

        System.out.println(10/3);//3
        System.out.println(10%3);//1 (3+3+3+1=10)

        System.out.println("Float * Int:" +  aFloat1 * aInt1);//200.0
        System.out.println("Float * Double:" +  aFloat1 * aDouble);//0.019999999552965164
        System.out.println("Int + Double:" +  aInt1 + aDouble);//100001.0
        System.out.println("Int * Double:" +  aInt1 * aDouble);//10000.0
        System.out.println("Int * Double:" +  aInt1 * 12.1d);//121000.0

        System.out.println("Char + Byte:" +  aChar1 + aByte1);//s100
        System.out.println("Char + Byte as byte:" +  (byte) aChar1 + aByte1);//115100

        System.out.println("Double > IntMax:" +  (aDouble > aIntMax));//false
        System.out.println("Double > IntMin:" +  (aDouble > aIntMin));//true



    }
}