/*
   @author Siam-Al-mer Chowdhury
   CSC 201-004N
   Professor Tanes Kanchanawanchai
 A program in that computes Remainder with exception handeling
   */
import java.io.*;
import java.util.Scanner;


public class Remainder {
    public static void main(String[] args) throws Exception {
        try {

                char ch;
                //used to check whether the user  gets secpnd chance or not
                do {
                    System.out.println("Enter the 1st number: ");
                    BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(System.in));
                    String num1 = bufferedreader.readLine();
                    Float value1 = Float.parseFloat(num1);
                    System.out.println("Enter the 2nd num: ");
                    String num2 = bufferedreader.readLine();
                    Float value2 = Float.parseFloat(num2);

                    //Check whether value is '0'
                    if ((value2 == 0) || (value1 == 0)) {
                        //throw Arithmatic exception
                    } else {
                        Float result = value1 % value2;
                        System.out.println("Result: " + result);
                    }
                    //For SecondChance
                    System.out.println("Do you want to continue? (y/n)");
                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                    String s = br.readLine();
                    //get char input
                    ch = s.charAt(0);
                } while ((ch=='y')||(ch =='Y'));
                    }
                    //throw arithmetic exception
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException");
        }

    }

}



