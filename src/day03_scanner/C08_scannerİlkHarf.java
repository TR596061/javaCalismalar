package day03_scanner;

import java.util.Scanner;

public class C08_scannerİlkHarf {

    public static void main(String[] args) {
        // kullanıcıdan iamini alıp ilk harfini buyuk harf yazdırır

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");

        char ilkHarf= scan.next().toUpperCase().charAt(0);
        System.out.println("ismin ilk harfi :" + ilkHarf );

    }
}
