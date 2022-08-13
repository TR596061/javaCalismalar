package day10_strinManipulation;

public class C04_equelsinnorecase {

    public static void main(String[] args) {
        String str1 = "Ali Can";
        String str2 = "ali can";
        String str3= "ALİ CAN";
        String str4= "Ali Can";

        System.out.println( str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
