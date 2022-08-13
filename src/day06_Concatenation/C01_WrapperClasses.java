package day06_Concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        String str= "java ile hayat çok güzel";

        System.out.println(str.toUpperCase());
        boolean güzelmi=true;
        Boolean buGüzelMi=true;
        buGüzelMi.toString();
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        String ÖğrNo="123456";

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 5 basamaklı bir şifre giriniz");
        String sifre=scan.nextLine();
        Integer sifresayı=Integer.parseInt(sifre);

        System.out.println("girilen sifre:"+ sifre);
        System.out.println("Integer sifre : "+sifresayı);



    }
}
