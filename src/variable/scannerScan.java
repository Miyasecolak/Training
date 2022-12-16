package variable;

import java.util.Scanner;

public class scannerScan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isinizi giriniz");

        String kullaniciIsmi= scan.nextLine();
        System.out.println("girilen kullanici ismi:"+ kullaniciIsmi);
    }
}
