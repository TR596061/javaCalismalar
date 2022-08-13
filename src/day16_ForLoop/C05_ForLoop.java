package day16_ForLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        /*Soru 10 ) Kullanicidan iki sayi isteyin.
Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
sonucu yazdiran bir method yaziniz*/

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen başlangıc ve bitiş değerlerini tamsay olarak girin");
        int bas = scan.nextInt();
        int bitiş = scan.nextInt();

        aralarıTopla(bas, bitiş);
    }

    public static void aralarıTopla(int bas, int bitiş) {
        int toplam = 0;
        if (bas <= bitiş) {
            for (int i = bas; i <= bitiş; i++) {
                toplam += i;
            }

        } else {
            for (int i = bitiş; i <= bas; i++) {
                toplam += i;

            }
        }
        System.out.println("aradaki sayıların toplamı :"+ toplam);
    }
}