/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class PasajeMenorEdad extends PasajeInterCantonal {
    
    
    @Override
    public void establecerValorPasaje(){
        valorPasaje = 100;
    }
    
    @Override
    public String toString(){
        return String.format("%s\n%.2f\n", super.toString(), obtenerValorPasaje());
    }
}
