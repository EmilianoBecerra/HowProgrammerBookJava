package ch01;

import java.util.Scanner;

public class PruebaLibroCalificaciones {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        LibroCalificaciones libroCalificaciones1 = new LibroCalificaciones("CS101 Introduccion a la programacion en Java", "Emiliano");
        LibroCalificaciones libroCalificaciones2 = new LibroCalificaciones("CS102 Estructuras de datos en Java", "Carlo");
        
        
        //System.out.print("Escriba el nombre de un curso: ");
        //String nombreDelCurso = input.nextLine();
        //System.out.println("");
        
        
        
        
        
        libroCalificaciones1.mostrarMensaje();
        libroCalificaciones2.mostrarMensaje();
        
        
    }
}
