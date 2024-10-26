import java.util.*;
public class sifreBasic {
    public static void main(String[] args) {
       int password ;
        boolean isPasswordSuccess = true ;

        Scanner input = new Scanner(System.in);

        while (isPasswordSuccess){
    System.out.print("Şifre giriniz : ");
    password = input.nextInt();

    if (password == 123) {
        System.out.println("Doğru");
         isPasswordSuccess = false ;
    }
    else {
        System.out.println("Yanlış");
    }
        }
    }
}