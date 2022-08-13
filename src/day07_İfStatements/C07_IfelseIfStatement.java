package day07_İfStatements;

import java.util.Scanner;

public class C07_IfelseIfStatement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz");
        int yaş=scan.nextInt();

        if (yaş<0){
            System.out.println("lütfen geçerli bir yaş giriniz");
        }else if (yaş<65){
            System.out.println("emekli olamazsın,"+(65-yaş)+" yıl daha çalışmalısın");
        }else {
            System.out.println("emekli olabilirsin");
        }
    }
}


