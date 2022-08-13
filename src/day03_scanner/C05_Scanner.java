package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println( "Lütfen ilk sayıyı ggirin");
       double sayı1= scan.nextDouble();
        System.out.println("Lütfen 2. sayıyı giriniz");
        double sayı2= scan.nextDouble();
        System.out.println( " Girilen sayıların çarpımı :"+ sayı1 * sayı2);



    }
}
