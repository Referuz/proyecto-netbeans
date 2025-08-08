package vista;

import controlador.ControladorAlumno;
import java.util.Scanner;
import modelo.Alumno;

public class Menu {
    public static void main(String[] args) {
        //Vista realizada por Diego
        ControladorAlumno cc=new ControladorAlumno();
        String contestacion=new String();
        Scanner scanner=new Scanner(System.in);
        int tamanoFila=0;
        int tamanoColumna=0;
        System.out.println("Establece el tamano del grupo");
        System.out.println("¿Cuantas filas son?");
        tamanoFila=scanner.nextInt();
        System.out.println("¿Cuantos alumnos son por fila?");
        tamanoColumna=scanner.nextInt();
        System.out.println("Ingrese los alumnos");
        Alumno[][] alumnos=llenarAlumos(tamanoFila, tamanoFila);
        
        do{
            System.out.println("Seleccione la opción que desea realizar:");
            System.out.println("1: Determinar el promedio por fila");
            System.out.println("2: Determinar el promedio de la edad grupal");
            System.out.println("3: Determinar la fila mas destacada del grupo");
            System.out.println("4: Determinar el alumno mas destacado");
            
            int opcion;
            opcion=scanner.nextInt();
            switch (opcion){
                case 1:
                    for (int i=0; i<tamanoColumna; i++)
                        imprimirFila(i, alumnos[i]);
                    break;
                case 2:
                    double promedioEdad=cc.calcularPromedioEdad(alumnos);
                    System.out.println("El promedio de edad grupal es de: "+ String.format("%.2f", promedioEdad));
                    break;
                case 3:
                    int filaDestacada=cc.calcularFilaMasDestacada(alumnos);
                    double promedioAlto=cc.calcularPromedioAltoFila(alumnos);
                    System.out.println("La fila mas destacada es la fila: "+ filaDestacada+ " con un promedio de: "+ String.format("%.2f", promedioAlto));
                    break;
                case 4:
                    Alumno alumnoDestacada=cc.calcularAlumnoDestacado(alumnos);
                    double mejorPromedio=cc.calcularPromedioAlto(alumnos);
                    System.out.println("El alumno mas destacado es: "+ alumnoDestacada.getNombre() + " con un promedio de: "+ String.format("%.2f", mejorPromedio));
                    break;
                default:
                    System.out.println("Opción no valida");
            }
            System.out.println("¿Desea realizar otra acción? [Si/No]");
            contestacion=scanner.next();
            contestacion=contestacion.toUpperCase();
        } while (contestacion.equals("SI"));
        System.out.println("Hasta luego");
    }
    public static Alumno[][] llenarAlumos(int n, int m){
        Alumno[][] alumnos=new Alumno[n][m];
        for (int i=0; i<n; i++)
            for (int j=0; j<m; j++){
                System.out.println("Ingrese el alumno " +(j+1) +" de la fila " + (i+1));
                alumnos[i][j]=llenarAlumno();
            }
        return alumnos;
    }
    public static Alumno llenarAlumno(){
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
    public static void imprimirFila(int i, Alumno[] alumnos){
        ControladorAlumno cc=new ControladorAlumno();
        double promedio=cc.calcularPromedioFila(alumnos);
        i++;
        System.out.println("La fila "+ i +" tiene un promedio de " + String.format("%.2f", promedio));
    }
}
