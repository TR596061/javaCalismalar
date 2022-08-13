package day08_İfStatements;

import java.util.Locale;
import java.util.Scanner;

public class C01_IfElseIfStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir gün ismi giriniz");

        String gün = scan.nextLine().toLowerCase(Locale.ROOT);

        if (gün.equals("pazartesi")) {
            System.out.println("Paz");
        } else if (gün.equals("sali")) {
            System.out.println("sal");
        } else if (gün.equals("çarşamba")) {
            System.out.println("çar");

        } else if (gün.equals("perşembe")) {
            System.out.println("per");
        } else if (gün.equals("cuma")) {
            System.out.println("cum");
        } else if (gün.equals("cumartesi")) {
            System.out.println("cum");
        } else if (gün.equals("pazar")) {
            System.out.println("paz");
        } else {

            System.out.println("lutfen gecerli bir gün ismi giriniz");
        }
    }
}
