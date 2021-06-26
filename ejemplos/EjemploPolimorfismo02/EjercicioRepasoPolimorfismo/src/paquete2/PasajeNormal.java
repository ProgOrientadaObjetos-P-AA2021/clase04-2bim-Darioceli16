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
public class PasajeNormal extends PasajeInterCantonal {
    
    @Override
    public void establecerValorPasaje(){
        valorPasaje = 200;
    }
    
    @Override
    public String toString(){
        return String.format("\n%.2f\n", obtenerValorPasaje());
    }
}
