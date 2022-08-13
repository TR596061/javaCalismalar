package day11_stringManipulations;

public class C02_lastindexof {

    public static void main(String[] args) {

        String cumle = "Java çok kolay, Java Çok guzel";

        String kelime = "java";

        int kelimeilkindex = cumle.indexOf(kelime);
        int kelimesonindex = cumle.lastIndexOf(kelime);

        if (kelimeilkindex == -1){
            System.out.println("verilen kelime cumlede kullanılmamış");
        }else if (kelimeilkindex == kelimesonindex){
            System.out.println( "verilen kelime cumlede 1 defa kullanılmış");
        }else{
            System.out.println ("verilen kelime cumlede  birden fazla kullanılmış");
        }




    }
}
