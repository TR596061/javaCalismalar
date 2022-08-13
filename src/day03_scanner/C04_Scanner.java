package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println( "LÜTFEN isminizi Giriniz");
        String Kullanıcıİsmi= scan.next();

        System.out.println("İsminiz :" + Kullanıcıİsmi);
    }
}
