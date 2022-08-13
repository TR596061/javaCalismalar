package day07_İfStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_BasitIfStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen gün ismi giriniz");
        String girilengün = scan.next().toLowerCase();

        if (girilengün.equals("pazar") || girilengün.equals("cumartesi")) {
            System.out.println("girilen gün haftasonu");
        }

        if (girilengün.equals("pazartesi") || girilengün.equals("salı") || girilengün.equals("çarşamba")
                || girilengün.equals("perşembe") || girilengün.equals("cuma")) {
            System.out.println("girilengün haftaiçi");
        }
        if (!(girilengün.equals("pazartesi") || girilengün.equals("salı")
                || girilengün.equals("çarşamba")
                || girilengün.equals("perşembe") || girilengün.equals("cuma")
                ||girilengün.equals("cumartesi") ||girilengün.equals("pazar"))) {
            System.out.println("Lütfen geçerli bir gün giriniz");
        }
    }
}