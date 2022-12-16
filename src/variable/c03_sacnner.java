package variable;

import java.util.Scanner;

public class c03_sacnner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        char ilkHarf =scan.next().charAt(0);
        System.out.println("Girilen kelimenin ilk harfi:"+ilkHarf);
    }
}
