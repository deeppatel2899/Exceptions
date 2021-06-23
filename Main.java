package com.deeppatel;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Method without Exception
        System.out.println(divsion(10,5));
        System.out.println(divsion(10,0));

        // Method with Exception
        System.out.println(divsionEx(10,5));
        System.out.println(divsionEx(10,0));

        // Method without Exception
        System.out.println("The user INPUT is "+userInput());

        // Method with Exception
        System.out.println("The user INPUT is "+userInputEx());
    }
    private static int divsion(int x, int y){
        if(y!=0){
            return x/y;
        }else{
            return 0;
        }
    }

    private static int divsionEx(int x, int y){
        try{
            return x/y;
        }catch (ArithmeticException e){
            return 0;
        }
    }

    public static int userInput(){
        Scanner sc = new Scanner(System.in);
        boolean ifValid = true;
        System.out.println("Please Enter a Number :");
        String userIn = sc.next();
        for(int i=0; i<userIn.length();i++) {
            if (!Character.isDigit(userIn.charAt(i))) {
                ifValid = false;
                break;
            }
        }
            if (ifValid){
                return Integer.parseInt(userIn);
            }
            return 0;
        }

    public static int userInputEx(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number : ");
        try{
            return sc.nextInt();
        }catch (InputMismatchException e){
            return 0;
        }
    }
}
