package day17_nestedForLoop;

public class C07_WhileLoop {
    public static void main(String[] args) {
        int bas=20;
        int bitiş=50;

        for (int i = bas; i <=bitiş ; i++) {

            if (i%2==0){
                System.out.print(i+" ");
            }

        }
        System.out.println(" ");
        int temp=bas;
        while (temp<=bitiş){
            if (temp%2==0){
                System.out.print(temp+" ");
            }
            temp++;
        }
    }
}
