package replaceFrist;

public class Question_4 {
    public static void main(String[] args) {
        //Question 4 : Ask the user for a password, check the following terms and tell the user any missing
        //terms that need to be corrected, if it satisfies all conditions, print "password saved successfully"
        //- the first letter must be lowercase
        //- the last character must be a number
        //- the password must not contain spaces
        //- the length must be at least 10 characters

        String password = "handmade 12345";

        boolean allOk=true;
        if (!(password.charAt(0) >= 'a' && password.charAt(0) <= 'z')) {
            System.out.println("the first letter must be lowercase");
            allOk=true;

        }if (!(password.charAt(password.length() - 1) >= '0' && password.charAt(password.length() - 1) <= '9')) {
            System.out.println("the last character must be a number");
            allOk=true;

        }if (password.contains(" ")){
            System.out.println("the password must not contain spaces");
            allOk=false;

        }if (!(password.length()>=10)){
            System.out.println("the length must be at least 10 characters");
            allOk=true;

        }if (allOk){
            System.out.println("password saved successfully");
        }
    }
}