package Day1;

import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args){

     Scanner in = new Scanner(System.in);
     System.out.print("What Country are you from? ");
     String citizen = in.nextLine().toLowerCase();

     String nationality = "ethiopia";
     //two options for changing lowercase and uppercase comparison
     if (citizen.equalsIgnoreCase(nationality)) {
         System.out.print("What is your age? ");
         int age = in.nextInt();

         if (age >= 18 && age <= 90){
             System.out.println("You are an adult to Vote");
         } else {
             if ( age < 18){
                 System.out.println("You have left " + (18- age) + " age to Vote");
             }
             else {
                 System.out.println("You are Old to Vote ");
             }
         }
     } else {
         System.out.println("You are not Ethiopian, you can not Vote");
     }
    }
}
