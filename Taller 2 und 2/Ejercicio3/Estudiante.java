package Ejercicio3;

public class Estudiante {

    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    public Estudiante() {
        this("Andres fuentes", 12);
    }

    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + "años");
    }
    public static void metodoStatico() {
        System.out.println(this.nombre);
    }
}



