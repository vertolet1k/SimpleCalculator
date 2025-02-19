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
    public double add(double a, double b) {
        return a+b;
    }
    

    public double substract(double a, double b) {
        return a-b;
    }


    
    public double multiply(double a, double b){
        return a*b;
    }
    
    public double divide(double a, double b){
        if (b==0){
            return 0;
        } else
            return a/b;
    }

    public double power(float num, float num_power){
        return Math.pow(num, num_power);
    }
    


}
