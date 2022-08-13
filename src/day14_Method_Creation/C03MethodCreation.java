package day14_Method_Creation;

public class C03MethodCreation {

    public static void main(String[] args) {

        String isim="Enes";
        String soyisim="Bozkurt";

        ismiGizle(isim,soyisim);
    }

    public static void ismiGizle(String isim, String soyisim) {

        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");

        System.out.println(isim+" "+ soyisim);

    }
}
