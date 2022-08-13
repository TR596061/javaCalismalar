package day04_dataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {
        char harf='a';
        char yeniharf=(char) (harf+1);
        System.out.println(yeniharf);

        int sayı1= (int) 7.3;

        double sayı2=10;
        System.out.println("sayı2 :" + sayı2);

        int sayı3='c';
        System.out.println("sayı3 :" + sayı3);
        char harf2=98;
        System.out.println("harf2 :" + harf2);
    }
}
