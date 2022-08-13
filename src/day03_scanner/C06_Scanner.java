package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {
        /* kullanıcıdan ismini soy ismini ve
        yaşını alıp girilen bilgiler = seyfi çapar 34
        şeklinde yazdırın
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");
        String İsim= scan.nextLine();
        System.out.println("Lütfen Soy İsminizi Giriniz");
        String soyisim = scan.nextLine();
        System.out.println("Lütfen Yaşınızı Giriniz");
        double Yaş = scan.nextDouble();

        System.out.println("girilen bilgiler = " + İsim + " " + soyisim +" , " + Yaş );
    }
}
