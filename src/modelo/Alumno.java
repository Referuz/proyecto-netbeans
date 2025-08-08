
package modelo;

/**
 *
 * @author juand
 * 
 */
public class Alumno {
    private String nombre, carrera;
    private int edad, cuatrimeste;
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

    public int getCuatrimeste() {
        return cuatrimeste;
    }

    public void setCuatrimeste(int cuatrimeste) {
        this.cuatrimeste = cuatrimeste;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public Alumno(String nombre, int edad, String carrera, int cuatrimestre, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.cuatrimeste=cuatrimestre;
        this.promedio = promedio;
    }
    
    public Alumno(){
        
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", carrera=" + carrera + ", edad=" + edad + ", cuatrimeste=" + cuatrimeste + ", promedio=" + promedio + '}';
    }
    
}
