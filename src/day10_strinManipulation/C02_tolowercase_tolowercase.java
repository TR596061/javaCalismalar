package day10_strinManipulation;

import java.util.Locale;

public class C02_tolowercase_tolowercase {
    public static void main(String[] args) {
        String str = "Beni psikopata Bağlamayın";
        System.out.println(str.toUpperCase());

        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));
    }
}
