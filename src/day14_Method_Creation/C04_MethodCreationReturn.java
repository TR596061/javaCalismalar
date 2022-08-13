package day14_Method_Creation;

public class C04_MethodCreationReturn {

    public static void main(String[] args) {
        String isim="Enes";
        String soyisim="Bozkurt";

        String gizliisim=isimgizle(isim,soyisim);
        System.out.println(isim+ " "+soyisim);
        System.out.println(gizliisim);
    }

    public static String isimgizle(String isim, String soyisim) {
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");

        System.out.println(isim+" "+ soyisim);
        return isim+" "+soyisim;
    }


}
