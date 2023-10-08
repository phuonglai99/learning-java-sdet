package lab.lab_06;

import java.util.Scanner;

public class InputPassword {
    public static String CORRECT_PASS = "password123";
    public static int MAX_INPUT = 3;
     public static void checkInputPassword(){
         int numberInput = 0;
         boolean flag = false;
         System.out.println("Input your password:");
         while(numberInput<MAX_INPUT){
             Scanner scan = new Scanner(System.in);
             String input = scan.nextLine();
             if(input.equals(CORRECT_PASS)){
                 System.out.println("Successful");
                 flag = true;
                 break;
             }
             else {
                 System.out.println("Wrong password. Input again: ");
                 numberInput++;
             }

         }
         if(flag==false) System.out.println("Input wrong 3 times");
     }

    public static void main(String[] args) {
        checkInputPassword();
    }
}
