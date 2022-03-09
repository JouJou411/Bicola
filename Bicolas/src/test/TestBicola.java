/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Bicola;

/**
 *
 * @author Joabp
 */
public class TestBicola {
    public static void main(String[] args) {
        String cadena = "hola";
        Bicola bc = new Bicola(cadena.length());
        bc.separaConsoVoc(cadena);
        bc.mostrar();
    }
}
