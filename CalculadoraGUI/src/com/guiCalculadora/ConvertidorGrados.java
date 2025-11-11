/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.guiCalculadora;

/**
 *
 * @author Sabrina Vargas (utilizando el codigo del profesor)
 */
public class ConvertidorGrados {
    public int convertidorCelsiusAFahrenheit(int celsius) {
        int farenheit;
        farenheit = (int) (1.8 * celsius + 32);
        return farenheit;
    }

    public int convertidorFahrenheitACelsius(int farenheit) {
        int celsius;
        celsius = (int) ((farenheit - 32)/1.8);
        return celsius;
    }
}

