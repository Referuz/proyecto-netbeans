
package modelo;

/**
 *
 * @author juand
 * 
 */
public class Alumno {
    private String nombre, carrera, cuatrimestre;
    private int edad;
    private double promedio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(String cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public Alumno(String nombre, int edad, String carrera, String cuatrimestre, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.cuatrimestre = cuatrimestre;
        this.promedio = promedio;
    }
    
    public Alumno(){
        
    }
    
}
