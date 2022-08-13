package recap1;

import java.util.Scanner;

public class Q02_YolHızZaman {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("gideceğiniz yol mesafesi (km) :");
        double yol =scan.nextDouble();

        System.out.println("ortalama hızınız (km8sa)");
        double ort_hız=scan.nextDouble();

        double varış_suresi=yol/ort_hız;
        System.out.println("varış süreniz :" + varış_suresi + "sa");

        scan.close();
    }


}
