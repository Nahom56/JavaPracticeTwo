package Day1;

import org.w3c.dom.ranges.Range;

import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args){

        Scanner inputNum = new Scanner(System.in);
        System.out.println("Random Number: ");
        int num1 = inputNum.nextInt();
        int num2 = inputNum.nextInt();

        int myNumber = (int)(Math.random() * (num2-num1)) + num1;

        System.out.println("My Random Number is :" + myNumber);

        




    }

 }
