package day03_practice;

import java.util.Scanner;

public class Q02_StringManipwithMethodCreation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("bir string giriniz:");
        String str= scan.nextLine().toLowerCase();

        System.out.println( xyzVarmi(str));
    }

    private static boolean xyzVarmi(String str) {
        if (str.contains("xyz")){
            return true;
        }else
            return false;
    }
}
