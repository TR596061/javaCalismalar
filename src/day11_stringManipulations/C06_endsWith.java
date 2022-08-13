package day11_stringManipulations;

public class C06_endsWith {
    public static void main(String[] args) {
        String input="fatih@gmail.com";

        if (input.contains("@gmail.com")){
            System.out.println( "lutfen gmail adresi giriniz");

        }else if ( input.endsWith("@gmail.com")){
            System.out.println("email adresiniz kaydedildi");
        }else {
            System.out.println("lütfen yazımı kontrol edin");
        }
    }
}
