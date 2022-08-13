package day1;

import java.util.Scanner;

public class Q10_IfStatement01 {
    /*
     * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
     * ekrana yazdiran java kodunu yaziniz.
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Y/N ikilisinden birini giriniz : ");

        char karekter= scan.next().charAt(0);
        if (karekter== 'Y' || karekter == 'y'){
            System.out.println("YES");
        }else if (karekter =='N'|| karekter == 'n'){
            System.out.println("NO");
        }else System.out.println("yanlış giriş yaptınız, lütfen sadece Y/N ikilisinden birini tercih ediniz");

    }
}
