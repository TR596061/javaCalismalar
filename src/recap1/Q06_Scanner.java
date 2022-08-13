package recap1;

import java.util.Scanner;

public class Q06_Scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("bir işçi işi aç günde bitirmektedir");
        double birişçibitirmesüresi = scan.nextDouble();

        System.out.println("toplam kaç işçi çalışacak");
        double işçi_sayısı = scan.nextDouble();

        double çoklubitirmesüresi = birişçibitirmesüresi / işçi_sayısı;
        System.out.println("çoklubitirmesüresi = " + çoklubitirmesüresi);




    }
}
