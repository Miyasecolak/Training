package D_15_12;

import java.util.Scanner;

public class S_2 {
    /* Soru 4 : Kullanicidan isim ve soyismini ayri ayri alin.
- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
   yazdirin
- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
   harflerle yazdirin.
   */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adinizi giriniz");
        String ad = scan.nextLine();
        System.out.println("Lutfen soyadinizi giriniz ");
        String soyad = scan.nextLine();

        if (ad.length() > soyad.length()) {
            System.out.println(ad.toUpperCase().charAt(0) + ad.substring(1).toLowerCase()
                    + " " + soyad.toUpperCase().charAt(0) + soyad.substring(1).toLowerCase());
        } else  {
            System.out.println(ad.toUpperCase().charAt(0) + ad.substring(1).toLowerCase()
                    + " " + soyad.substring(0).toUpperCase());
        }
    }
}