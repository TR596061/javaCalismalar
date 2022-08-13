package day18_While_doWhileLoop;

public class C02_WhileLoop {

    public static void main(String[] args) {

        int input=54321;

        int rakamlartoplamı=0;
        int birlerBasamagı=0;
        int temp=input;

      while (temp>0){
          birlerBasamagı=temp%10;
          rakamlartoplamı+=birlerBasamagı;
          temp/=10;
      }
        System.out.println(input+"sayısının rakamlar toplamı:" + rakamlartoplamı);
    }
}
