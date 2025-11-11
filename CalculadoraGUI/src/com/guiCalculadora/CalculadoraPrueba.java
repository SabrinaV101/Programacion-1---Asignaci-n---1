/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.guiCalculadora;

/**
 *
 * @author Sabrina Vargas
 */
public class CalculadoraPrueba {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora(); 
        Double resultado = cal.sumar(Double.NaN, Double.NaN);
        System.out.println("resultado = " + resultado);
    
    }
}
