package day14_Method_Creation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {
        String sehir=sehirAl();
        String tarih=tarihAl();
        System.out.println("girdiğiniz şehir:" + sehir);
        System.out.println("girdiğiniz tarih :"+ tarih);
    }

    public static String tarihAl() {
        String tarih="";
        Scanner scan=new Scanner(System.in);
        System.out.println("yil giriniz");
        int yil=scan.nextInt();
        if (yil>1900 || yil<2100){
            tarih=yil+"-";
        }else{
            System.out.println("yil için gecerli bir sayı yazmalısınız(1900-2100)");
        }
        System.out.println("Kacıncı ay olduğunu tamsayı olarak yazınız");
        int ay=scan.nextInt();
        if (ay<0 || ay>12){

            System.out.println("Ay no 1-12 arasında olmalıdır");
        }else if (ay<10){
            tarih=tarih+"0"+ay+"-";
        }else {
            tarih=tarih+ay+"-";
        }
        System.out.println("Lutfen ayin kaçıncı günü olduğunu tamsayı olarak giriniz");
        int gün=scan.nextInt();
        if (gün<10||gün>31){

            System.out.println("gün no olarak 1-31 arasında sayı girilmelidir");
        }else if(gün<10){
            tarih=tarih+"0"+gün;
        }else {
            tarih=tarih+gün;
        }
        return tarih;
    }

    public static String sehirAl() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen şehir adı giriniz");
        String sehiradı=scan.next().toUpperCase();
        return sehiradı;
    }
    }

