package Arrays;

import java.util.Scanner;

public class Array_List {
    public static void main(String[] args) {
        //        1-Kullanıcı tarafından girilen string
//        ifadenin içindeki sayısal değerleri toplayan metodu yazınız
        Scanner scan=new Scanner(System.in);
        System.out.println("cümle giriniz");
        String cumle=scan.nextLine();
        System.out.println(sayisalDegerleriTopla(cumle));

    }

    private static int sayisalDegerleriTopla(String cumle) {

        int sum=0;

        String cumleArr[]=cumle.split("");
        for (int i = 0; i < cumleArr.length; i++) {
            if (Character.isDigit(cumleArr[i].charAt(0))){
                sum+=Integer.valueOf(cumleArr[i]);
            }

        }
        return sum;

    }
}
