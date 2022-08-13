package day08_İfStatements;

import java.util.Scanner;

public class C05_NestedIfElse {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen şifre giriniz");
        String sifre= scan.nextLine();
        char ilkharf=sifre.charAt(0);
        if (ilkharf>='A' && ilkharf<='Z'){
            if (ilkharf=='A'){
                System.out.println("geçerli şifre");
            }else {
                System.out.println("geçersiz şifre");
            }
        }else if (ilkharf>='a'  && ilkharf<='z'){
            if (ilkharf=='z'){
                System.out.println("geçerli şifre");
            }else {
                System.out.println("geçersiz şifre");
            }
        }else {
            System.out.println("lütfen ilk karekter için sadece harf giriniz");
        }
    }
}
