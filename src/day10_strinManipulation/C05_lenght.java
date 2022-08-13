package day10_strinManipulation;

public class C05_lenght {

    public static void main(String[] args) {
        String str="Java ögren işi kap";
        System.out.println(str.length());
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.charAt(str.length()-3));

        String str2= "";
        System.out.println(str2.length());
        String str3= null;
        System.out.println(str3.length());

    }
}
