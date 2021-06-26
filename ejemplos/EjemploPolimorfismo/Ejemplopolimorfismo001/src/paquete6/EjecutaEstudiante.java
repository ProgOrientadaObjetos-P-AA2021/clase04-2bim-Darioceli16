
package paquete6;

import java.util.ArrayList;
import java.util.Scanner;
import paquete4.Estudiante;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de docentes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.
        
        */
        
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        
        // inicio de solución
                
        EstudiantePresencial e1 = new EstudiantePresencial("José", 
                "Alvear", 20, 30);
        EstudiantePresencial e2 = new EstudiantePresencial("Daniela", 
                "Jaramillo", 25, 25);
        EstudianteDistancia e3 = new EstudianteDistancia("Luis", 
                "Herrera", 5, 60);
        EstudianteDistancia e4 = new EstudianteDistancia("Luisa", 
                "Vazques", 6, 60);
        
        
        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();
            
            System.out.printf("Datos Estudiante\n"
                        + "%s\n",                        
                  estudiantes.get(i));
            
        }
    }

}