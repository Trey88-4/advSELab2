//Author: Treyden Wilson
//Date: 09/28/2022
//File: advSELab2.java

//imports
import java.util.Scanner;
import java.util.Stack;

//public class Lab2Calculator
public class Lab2Calculator {

    //main
    public static void main(String[] args){
        //string equation to hold input
        String equation = "";
        //set equation to user input
        equation = getEquation(equation);

        System.out.println(equation);


    }

    //gets input from user
    public static String getEquation(String e){
        //print out message for user
        System.out.println("Please enter equation:");
        //scan for input
        Scanner scan = new Scanner(System.in);
        //set e to user input
        e = scan.nextLine();
        //return e
        return e;
    }

    //shunting algorithm

    //checks type of character - either operator or number
    public static boolean checkType(char ch){
        if(Character.isLetterOrDigit(ch)){
            return true;
        }else{
            return false;
        }

    }

    // need pemdas operation of some sort using post fix

    public static void separate(String e){

    }
    /*
    //add
    public static double add(double a, double b){
        return a+b;
    }
    //subtract
    public static double sub(double a, double b){
        return a-b;
    }
    //multiply
    public static double multi(double a, double b){
        return a*b;
    }
    //divide
    public static double div(double a, double b){
        return a/b;
    }
    public static void checkClose(){
    }

     */
}
