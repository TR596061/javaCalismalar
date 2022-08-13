package day14_Method_Creation;

public class C01_MethodCreation {
    public static void main(String[] args) {

    }
    public static void terstenyazdır(String input){
        String tersInput=input.substring(3)+
                        input.substring(2,3)+
                        input.substring(1,2)+
                        input.substring(0,1);

        System.out.println("verilen kelimenin tersten yazılışı :" + tersInput);
    }
}
