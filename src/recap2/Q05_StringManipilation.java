package recap2;

import java.util.Scanner;

public class Q05_StringManipilation {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen isminizi ve soyisminizi giriniz");
        String firstname=scan.nextLine(),
                lastName=scan.nextLine();// multıple declaration
        String fullName=firstname.concat(" "+lastName).toUpperCase();
        System.out.println("fullname=" + fullName);

    }
}
