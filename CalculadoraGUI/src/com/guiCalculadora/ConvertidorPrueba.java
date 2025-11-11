/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.guiCalculadora;

/**
 *
 * @author Sabrina Vargas
 */
public class ConvertidorPrueba {
     public static void main(String[] args) {
        ConvertidorGrados cg = new ConvertidorGrados();
        int fahrenheit = cg.convertidorCelsiusAFahrenheit(30);
        System.out.println("Grados Fahrenheit  = " + fahrenheit );
    }
     
        ConvertidorGrados cg = new ConvertidorGrados(); {
        int celcius = cg.convertidorFahrenheitACelsius (30);
        System.out.println("Grados Celsius = " + celcius );
    
    }

}
