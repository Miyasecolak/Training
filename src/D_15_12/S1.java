package D_15_12;

import java.util.Scanner;

public class S1 {
    public static void main(String[] args) {
        //Soru 1 : Kullanicidan bir String ve aranacak metin alin. String’in aranan metni
        //icerip icermedigini indexOf( ) method’u kullanarak yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz");
        String str=scan.nextLine();
        System.out.println("Lutfen string'in icerisinde aranacak bir kelime girin");
        String srcWord=scan.nextLine();

        // if (str.indexOf(srcWord)==-1) System.out.println("String aranan metni icermez");
        //else System.out.println("String aranan metni icerir");

        System.out.println(str.indexOf(srcWord)!=-1);
    }
}
