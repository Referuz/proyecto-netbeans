/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Alumno;

/**
 *
 * @author ortiz
 */
public class ControladorAlumno {
    //promedio de una fila
    public double calcularPromedioFila(Alumno[] fila) {      
    double suma = 0; 
    for (Alumno a : fila) {   //recorre alumnos (bucle for-each)
    suma += a.getPromedio();  
    }
    return suma / fila.length;
    }
    
    //promedio de edad del grupo
public double calcularPromedioEdad(Alumno[][] grupo) {
    double suma = 0;
    int total = 0;
    for (Alumno[] fila : grupo) {
        for (Alumno a : fila) {
            suma += a.getEdad();
            total++;
        }
    }
    return suma / total;
}

//define la fila con mejor promedio
public int filaMasDestacada(Alumno[][] grupo) {
    int filaDestacada = 0;
    double maxPromedio = 0;

    for (int i = 0; i < grupo.length; i++) {  //Recorre las filas
        double promedio = calcularPromedioFila(grupo[i]);
        if (promedio > maxPromedio) {
            maxPromedio = promedio;  //actualiza mejor promedio
            filaDestacada = i;   
        }
    }
    return filaDestacada;
}

//devuelve alumno destacado
  public Alumno alumnoDestacado(Alumno[][] grupo) {
        Alumno destacado = grupo[0][0];  //Accede a la matriz, comienza accediendo por la 1ra. fila y el 1er. alumno de la 1ra. fila
            for (Alumno[] fila : grupo) {  //Recorre cada fila del grupo
            for (Alumno a : fila) {
                if (a.getPromedio() > destacado.getPromedio()) {  //Compara promedios
                    destacado = a;
                }
            }
        }
        return destacado;
    }
}






