package day1;

import java.util.Scanner;

public class Q09_Scanner02 {

// kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
// ve yasadiklari yeri seviyorlarsa
// bu bilgiyi yazdirin

// next() only can read the first word
// nextLine() can read the whole line

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("İsminiz");
        String isim = scan.nextLine();

        System.out.println("memleketiniz :");
        String memleket= scan.nextLine();

        System.out.println("konumunuz");
        String konum=scan.nextLine();

        System.out.println("yaşınız");
        int yaş = scan.nextInt();

        System.out.println("boyunuz");
        double boyunuz = scan.nextDouble();

        System.out.println("yaşadığınız " + konum +" u seviyor musunuz? true/false " ) ;
         boolean seviyormu= scan.nextBoolean();

        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("yaş = " + yaş);
        System.out.println("boyunuz = " + boyunuz);
        System.out.println("seviyormu = " + seviyormu);



    }
}
