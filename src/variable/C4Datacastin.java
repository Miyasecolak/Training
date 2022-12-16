package variable;

import java.util.Scanner;

public class C4Datacastin {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in );
        System.out.println("please input a integer");
        int a=scan.nextInt();

        System.out.println("please input a integer");
        int b= scan.nextInt();
        System.out.println("a/b =" + a/b);

        double c=a/b;
        System.out.println("a/b =" + c);

        double d= (double)a/b;
        System.out.println("a/b =" + d);
    }
}
