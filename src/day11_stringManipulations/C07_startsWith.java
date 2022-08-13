package day11_stringManipulations;

public class C07_startsWith {

    public static void main(String[] args) {
        String input= "Java gün geçtikçe güzelleşiyor";
        System.out.println(input.startsWith("J"));
        System.out.println(input.startsWith(""));
        System.out.println(input.startsWith("gün",5));
    }
}
