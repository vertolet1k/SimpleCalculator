/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplecalculator;

/**
 *
 * @author vika
 */
public class Calculator {
    public static String add(double a, double b) {
        return Double.toString(a+b);
    }
    

    public static String substract(double a, double b) {
        return Double.toString(a-b);
    }


    
    public static String multiply(double a, double b){
        return Double.toString(a*b);
    }
    
    public static String divide(double a, double b){
        if (b==0){
            return "ERROR";
        } else
            return Double.toString(a/b);
    }

    public static String power(double num, double num_power){
        return Double.toString(Math.pow(num, num_power));
    }
    


}
