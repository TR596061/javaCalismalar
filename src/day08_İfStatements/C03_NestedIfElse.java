package day08_İfStatements;

import java.util.Scanner;

public class C03_NestedIfElse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi yazınız" +
                "\n kadin için K erkek için E harfini giriniz ");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("lutfen yaşınızı giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet == 'E') {
            if (yas < 0 || yas > 80) {
                System.out.println("geçerli yaş giriniz");
            } else if (yas < 65) {
                System.out.println("emekli olamazsın");
            } else {
                System.out.println("emekli olabilirsin");
            }


        } else if (cinsiyet == 'K') {
            if (yas < 0 || yas > 80) {
                System.out.println(" geçerli yaş giriniz");

            } else if (yas < 60) {
                System.out.println("emekli olamazsın");
            } else {
                System.out.println("emekli olabilirsin");

            }


        }
    }
}