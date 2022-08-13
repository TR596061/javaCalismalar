package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print(" lütfen isminizi, soy isminizi ve yaşınızı giriniz \n aralarda enter tuşuna basınız");

        String isim=scan.nextLine();
        String soyisim= scan.nextLine();
        int yaş=scan.nextInt();

        System.out.println("girilen bilgiler = "+ isim+","+soyisim+" ,"+yaş);

    }
}
