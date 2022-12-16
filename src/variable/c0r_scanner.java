package variable;

import java.util.Scanner;

public class c0r_scanner {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim =scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim=scan.nextLine();
        System.out.println("Lütfen yasininzi giriniz");
        int yas =scan.nextInt();
        System.out.println("Girilen bilgiler: "+ isim.charAt(0)+" Al"+soyisim+","+yas);

    }
}
