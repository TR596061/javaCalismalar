package day06_Concatenation;

public class C02_Cancatenation {

    public static void main(String[] args) {
        String str1="Java";
        String str2="güzeldir";

        int sayı1=5;
        int sayı2=4;

        System.out.println(str1+" "+str2+" "+sayı1+sayı2);
        System.out.println(str1+" "+str2+ (sayı1+sayı2));
        System.out.println(str1.concat(str2));
        System.out.println(""+sayı1+sayı2+" "+str2);


    }
}
