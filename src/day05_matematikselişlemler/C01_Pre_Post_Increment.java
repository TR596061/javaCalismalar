package day05_matematikselişlemler;

public class C01_Pre_Post_Increment {

    public static void main(String[] args) {

        int sayı1=10;
        int sayı2= sayı1+1;
        sayı2 +=5;
        int sayı3=sayı2++;

        System.out.println("sayı3 :" + sayı3);
        System.out.println("sayı2 :" + sayı2);
        int sayı4=++sayı1;
        System.out.println("sayı4 : " + sayı4);
        System.out.println("sayı1 :" +sayı1);

    }


}
