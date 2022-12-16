package P_tesi_S_1;

public class S_4 {
    public static void main(String[] args) {
        //  4-String' lerden oluşan bir arrayde öğeler 'n'
        //  veya 'k' ile bitiyorsa, o öğelerin baş harflerini
        //  ekrana yazdıran metodu yazınız.
        //Örnek: { "Kemal", "Jonathan", "Mark", "Jackson", "Ali" } ==> Çıktı JMJ

        String []strArr={ "Kemal", "Jonathan", "Mark", "Jackson", "Ali" };
        System.out.println(sonHarfKontrol(strArr));
    }

    private static String sonHarfKontrol(String[] strArr) {
           String ilkHarfler="";
        for (int i = 0; i < strArr.length ; i++) {
            if (strArr[i].endsWith("k")||strArr[i].endsWith("n")){
                ilkHarfler+=strArr[i].charAt(0);

            }

        }
        return ilkHarfler;


    }
}
