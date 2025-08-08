/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.Scanner;
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
    public int calcularFilaMasDestacada(Alumno[][] grupo) {
        int filaDestacada = 0;
        double maxPromedio = 0;

        for (int i = 0; i < grupo.length; i++) {  //Recorre las filas
            double promedio = calcularPromedioFila(grupo[i]);
            if (promedio > maxPromedio) {
                maxPromedio = promedio;  //actualiza mejor promedio
                filaDestacada = i;   
            }
        }
        return filaDestacada+1;
    }
    public double calcularPromedioAltoFila(Alumno[][] alumnos){
        int n=alumnos.length;
        double promedioAlto=-1;
        double promedio;
        for (int i=0; i<n; i++){
            promedio=calcularPromedioFila(alumnos[i]);
            if (promedio>promedioAlto)
                promedioAlto=promedio;
        }
        return promedioAlto;
    }

//devuelve alumno destacado
    public Alumno calcularAlumnoDestacado(Alumno[][] grupo) {
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
    public double calcularPromedioAlto(Alumno[][] alumnos){
        double promedio=-1;
        int n=alumnos.length;
        int m=alumnos[0].length;
        for (int i=0; i<n; i++)
            for (int j=0; j<m; j++){
                if (alumnos[i][j].getPromedio()>promedio){
                    promedio=alumnos[i][j].getPromedio();
                }
            }
        return promedio;
    }
    public  Alumno[][] llenarAlumos(int n, int m){
        Alumno[][] alumnos=new Alumno[n][m];
        for (int i=0; i<n; i++)
            for (int j=0; j<m; j++){
                System.out.println("Ingrese el alumno " +(j+1) +" de la fila " + (i+1));
                alumnos[i][j]=llenarAlumno();
            }
        return alumnos;
    }
    public  Alumno llenarAlumno(){
        Scanner scanner=new Scanner(System.in);
        String nombre, carrera;
        int edad, cuatrimestre;
        double promedio;
        System.out.println("Ingrese el nombre del alumno");
        nombre=scanner.next();
        System.out.println("Ingrese la edad del alumno");
        edad=scanner.nextInt();
        System.out.println("Ingrese la carrera del alumno");
        carrera=scanner.next();
        System.out.println("Ingrese el cuatrimestre del alumno");
        cuatrimestre=scanner.nextInt();
        System.out.println("Ingrese el promedio del alumno");
        promedio=scanner.nextDouble();
        Alumno alumno=new Alumno(nombre, edad, carrera, cuatrimestre, promedio);
        return alumno;
    }
    public void imprimirFila(int i, Alumno[] alumnos){
        double promedio=calcularPromedioFila(alumnos);
        i++;
        System.out.println("La fila "+ i +" tiene un promedio de " + String.format("%.2f", promedio));
    }
}






