package day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {

        int sayı1= 10;
        int sayı2=20;
        int sayı3=0;

        sayı3=sayı2;
        sayı2=sayı1;
        sayı1=sayı3;

        System.out.println("swaptan önce sayı1 :" + sayı1);
        System.out.println("swaptan sonra sayı2 :"+ sayı2);
    }
    }
