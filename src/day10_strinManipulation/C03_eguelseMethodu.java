package day10_strinManipulation;

public class C03_eguelseMethodu {

    public static void main(String[] args) {

        String str1 = "Ali Can";
        String str2 = "Ali CAN";
        String str3= "Ali Can" + "";
        String str4= "Ali Can";
        String str5= new String("Ali Can");
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));

    }
}
