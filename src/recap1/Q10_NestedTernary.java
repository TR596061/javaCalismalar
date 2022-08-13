package recap1;

public class Q10_NestedTernary {

    public static void main(String[] args) {
        char finalnotu='C';

        String result= finalnotu=='A' ? "Gayet Başarılı" : finalnotu =='B' ?"Başarılı" : finalnotu=='C' ? "Ha gayret":"Diğerleri";
        System.out.println("result ="+result);
    }
}
