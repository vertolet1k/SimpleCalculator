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
    
    
    public double multiply(double a, double b){
        return a*b;
    }
    
    public double divide(double a, double b){
        if (b==0){
            return 0;
        } else
            return a/b;
    }
}
