package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02ArraydenListOluşturma {
    public static void main(String[] args) {

        Random rnd=new Random();
        int sayı=0;
        List<Integer>sayılist=new ArrayList<>();
        while (sayılist.size()<200){
            sayı= rnd.nextInt(1000);
            if (!sayılist.contains(sayı)){
                sayılist.add(sayı);
            }
            System.out.println(sayılist);
            boolean bildimi=false;
            int tahminsayısı=1;
            Scanner scan=new Scanner(System.in);

            while (!bildimi){
                System.out.println("lütfen bir sayı tahminide bulunun");
                sayı=scan.nextInt();
                if (sayılist.contains(sayı)){

                    System.out.println("tebrikler"+ tahminsayısı+"adet tahminde listeden bir sayı buldunuz");
                    bildimi=true;
                }else {
                    System.out.println(tahminsayısı+"adet sayı soylediniz ama hiç biri listede yok");
                    tahminsayısı++;
                }


            }
        }
    }

}
