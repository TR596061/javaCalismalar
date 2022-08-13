package day07_İfStatements;

import java.util.Scanner;

public class C05_IfElsestatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir karekter giriniz");
        char harf=scan.next().charAt(0);

        if ((harf>='a' && harf<='z') || (harf>='A'&& harf<='Z')){
            System.out.println("girilen karekter harftir");
        }else {
            System.out.println("girilen karekter bir harf değil");
        }
    }
}
