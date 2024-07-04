package com.dicoding.javafundamental.operator;

public class OperatorAritmatika {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int tambah = a + b ;
        int kurang = a - b ;
        int kali = a * b;
        float bagi = a/b;
        int modulus = a%b;
        System.out.println("Operator Matematika");
        System.out.println(a +"+"+ b + "=" + tambah );
        System.out.println();

        System.out.println("Operator Pengurangan");
        System.out.println(a + "-" + b + "=" + kurang );
        System.out.println();

        System.out.println("Operator Perkalian");
        System.out.println(a + "*" + b + "=" + kali );
        System.out.println();

        System.out.println("Operator Pembagian");
        System.out.println(a + "/" + b + "=" + bagi );
        System.out.println();

        System.out.println("Operator Modulus / Sisa bagi");
        System.out.println(a + "%" + b + "=" + modulus );
        System.out.println();



    }
}
