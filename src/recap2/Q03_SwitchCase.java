package recap2;

import java.util.Scanner;

public class Q03_SwitchCase {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("üç basamaklı bir sayı giriniz");
        int sayı=scan.nextInt();

        int birlerbas=sayı %10,onlarbas=(sayı/10) % 10,yuzlerbas=sayı/100;
        if (sayı>99 && sayı<1000);

        switch (yuzlerbas){
            case 0: System.out.println("");break;
            case 1: System.out.println("yuz\t");break;
            case 2: System.out.println("ikiyuz\t");break;
            case 3: System.out.println("üçyuz\t");break;
            case 4: System.out.println("dörtyuz\t");break;
            case 5: System.out.println("beşyuz\t");break;
            case 6: System.out.println("altıyuz\t");break;
            case 7: System.out.println("yediyuz\t");break;
            case 8: System.out.println("sekizyuz\t");break;
            case 9: System.out.println("dokuzyuz\t");break;
        }
        switch (onlarbas){
            case 0: System.out.println("");break;
            case 1: System.out.println("on\t");break;
            case 2: System.out.println("yirmi\t");break;
            case 3: System.out.println("otuz\t");break;
            case 4: System.out.println("kırk\t");break;
            case 5: System.out.println("elli\t");break;
            case 6: System.out.println("altaltmış\t");break;
            case 7: System.out.println("yetmiş\t");break;
            case 8: System.out.println("seksek\t");break;
            case 9: System.out.println("doksan\t");break;
        }
        switch (birlerbas){
            case 0: System.out.println("");break;
            case 1: System.out.println("bir");break;
            case 2: System.out.println("iki");break;
            case 3: System.out.println("üç");break;
            case 4: System.out.println("dört");break;
            case 5: System.out.println("beş");break;
            case 6: System.out.println("altı");break;
            case 7: System.out.println("yedi");break;
            case 8: System.out.println("sekiz");break;
            case 9: System.out.println("dokuz");break;
        }
    }

}
