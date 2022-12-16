package replaceFrist;

import java.util.Locale;

public class Question_5 {
    public static void main(String[] args) {
        /*
        Question 5 : Get the user's first and last name separately.
- if the name is longer, print the first letters of the name and surname as capitals and the rest
should be lowercase
- if the surname is longer, print the first letter of the name as capital and the rest of the name
should be lowercase. And all of surname letters should be in capitals
         */


        String name="miyase";
        String Surname= "Kahveci";

        if (name.length()>Surname.length()){

            System.out.println(name.substring(0,1).toUpperCase(Locale.ROOT)+name.substring(1).toLowerCase()+
                    " "+ Surname.substring(0,1).toUpperCase()+Surname.substring(1).toLowerCase());
        }if (Surname.length()>name.length()){
            System.out.println(name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase()+" "
                    +Surname.substring(0).toUpperCase());
        }


    }
}
