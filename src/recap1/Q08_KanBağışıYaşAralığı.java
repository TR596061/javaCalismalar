package recap1;

import java.util.Scanner;

public class Q08_KanBağışıYaşAralığı {
    /*
Problem tanimi :
Kullanicidan  yasini ve kilosunu alaliniz
18 yasindan kucuk ise kan bagisi yapamaz
18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
 */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("yaşınızı giriniz");
        int yaş =scan.nextInt();

        System.out.println( "kilonuzu giriniz");
        int kilo=scan.nextInt();

        if (yaş>0 && yaş<18){
            System.out.println("yaşı 18 den küçük olanlar kan bağışı yapamaz");
        }else if (yaş>=18) {
            if (kilo < 50) {
                System.out.println("kilonuz 50 den küçük kan bağışı yapamazsınız");
            } else if (kilo >= 50) {
                System.out.println("kan bağışı yapabilirsiniz");
            }
        }
        }

}
