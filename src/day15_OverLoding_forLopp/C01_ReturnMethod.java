package day15_OverLoding_forLopp;

public class C01_ReturnMethod {

    public static void main(String[] args) {
        int sayı1=10;
        int sayı2=5;

        int sonuç=carpGetir(sayı1,sayı2);
        System.out.println("illa da sonucu göreyim diyenlere:" + sonuç);
    }

    private static int carpGetir(int sayı1, int sayı2) {
      int sonuç=sayı1*sayı2;
        return sonuç;
    }
}
