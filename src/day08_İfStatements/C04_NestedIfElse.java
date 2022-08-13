package day08_İfStatements;

import java.util.Scanner;

public class C04_NestedIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen 4 basamaklı bir tam sayı giriniz");
        int sayı = scan.nextInt();

        if (sayı < 1000 || sayı > 9999) {
            System.out.println("lütfen 4 basamaklı sayı giriniz");
        } else if (sayı % 5 == 0) {
            if (sayı % 10 == 0) {
                System.out.println("5 e bölünen çift sayı");
            } else {
                System.out.println("5 e bölünen tek sayı");
            }

        } else {
            System.out.println("tekrar deneyin");
        }
    }
}
