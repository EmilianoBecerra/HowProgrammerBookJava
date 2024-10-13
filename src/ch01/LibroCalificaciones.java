//LibroCalificaciones.java
//Declaracion de una clase con metodos.

package ch01;


public class LibroCalificaciones {
    
    private String nombreDelCurso; //private -> ocultamiento de datos.
    private String nombreDeInstructor;
    
    public LibroCalificaciones(String nombre, String nombreInstructor){
        nombreDelCurso = nombre;
        nombreDeInstructor = nombreInstructor;
    }
    
    public void setNombreDelCurso(String nombre){
        nombreDelCurso = nombre;
    }
    
    public void setNombreInstructor(String nombreInstructor){
        nombreDeInstructor = nombreInstructor;
    }
    
    public String getNombreDelCurso(){
        return nombreDelCurso;
    }
    
    public String getNombreInstructor(){
        return nombreDeInstructor;
    }
    
    public void mostrarMensaje(){
        System.out.printf("Bienvenido al Libro de calificaciones para %s!\n", getNombreDelCurso());
        System.out.printf("Con el instructor %s\n", nombreDeInstructor);
    }
}
