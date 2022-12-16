package variable;

import java.util.Scanner;

public class scannerScan2 {
    public static void main(String[] args) {
        Scanner  Scan = new Scanner(System.in);
        System.out.println("Lütfen dairenin yaricapini giriniz");
        double yaricap= Scan.nextDouble();
        double daireAlani=3.14*yaricap*yaricap;
        System.out.println("Dairenin alani:"+daireAlani);

    }
}
