package day24_arrayLists_ForEachLoop;

public class C07_ArraydekiSayılarınKareToplam {
    public static void main(String[] args) {
        int[] sayılar={2,3,4,1,5,7,6,5,4,3};

        int toplam=0;
        for (int each:sayılar
             ) {
            toplam+=each*each;

        }
        System.out.println("kareler toplamı:" + toplam);
    }

}
