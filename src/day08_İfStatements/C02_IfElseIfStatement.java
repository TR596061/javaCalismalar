package day08_İfStatements;

import java.util.Scanner;

public class C02_IfElseIfStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("lüften 0 dan 100 e kadar bir not değeri giriniz");
        double not = scan.nextDouble();

        if (not < 0 || not > 100) {

            System.out.println("lütfen geçerli bir sayı giriniz");
        } else if (not < 50) {
            System.out.println("notunuz : D");
        } else if (not < 60) {
            System.out.println("notunuz : C");
        } else if (not < 80) {
            System.out.println("notunuz : B");
        } else if (not < 100) {
            System.out.println("notunuz : A");
        }
    }
}
