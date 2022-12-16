package replaceFrist;

public class C01_Replacement {
    public static void main(String[] args) {
        String str= "123J12a6690va is2345 bea67tiful";

        System.out.println(str.replaceAll("\\d",""));
        System.out.println(str.replaceAll("\\D",""));

        // Please calculate the total Price
        String str1="price is 2000 Euro";
        String str2="price is 1500 Euro";

        str1=str1.replaceAll("\\D","");
        str2=str2.replaceAll("\\D","");
        System.out.println(str1);
        System.out.println(str2);

        int str1Price=Integer.parseInt(str1);
        int str2Price=Integer.parseInt(str2);
        System.out.println("total Price is ="+ (str2Price+str1Price));




    }
}
