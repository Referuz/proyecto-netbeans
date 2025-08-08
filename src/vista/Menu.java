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
        Alumno[][] alumnos=cc.llenarAlumos(tamanoFila, tamanoFila);
        
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
                        cc.imprimirFila(i, alumnos[i]);
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
    
}
