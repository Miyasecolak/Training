package variable;

import java.util.Scanner;

public class castingChar {
    public static void main(String[] args) {
        int a='a'+'b';
        System.out.println('a'+'b');
        System.out.println(""+'a'+'b');

        Scanner scan =new Scanner(System.in);
        System.out.println("input a char");
        char inputChar=scan.next().charAt(0);

        System.out.println("input Char: "+inputChar);
        System.out.println("after the inputChar: "+ (char)(inputChar+1));
        System.out.println("after the inputChar: "+ (char)(inputChar+2));
        System.out.println("after the inputChar: "+ (char)(inputChar+3));


    }
}
