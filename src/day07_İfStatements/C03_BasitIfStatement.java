package day07_İfStatements;

public class C03_BasitIfStatement {

    public static void main(String[] args) {

        int sayı=23;
        if (sayı>0)
            System.out.println("sayı pozitif");
            System.out.println("pozitif kalacaktır");
        System.out.println("uçuncu satır");

        if (sayı%2==0)
            System.out.println("sayı çift");
            System.out.println("sayı çift kalacaktır");

        if (sayı%5==0)
            System.out.println("sayı 5 in katı");


    }
}