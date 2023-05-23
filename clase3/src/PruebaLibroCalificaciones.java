import java.util.Scanner;

public class PruebaLibroCalificaciones {

    public static void main (String args[]){

        Scanner entrada=new Scanner(System.in);

    LibroCalificaciones miLibroCalificaciones=new LibroCalificaciones();

        System.out.println("Escriba el nombre del curso: ");
        String nombreDelCurso=entrada.nextLine();
        System.out.println();

        miLibroCalificaciones.mostrarMensaje(nombreDelCurso);

        //2do
        System.out.print( "El nombre del curso es "+ miLibroCalificaciones.obtenerNombreDelCurso() );

        System.out.println( "Escriba el nombre del curso" );
        String elNombre = entrada.nextLine();
        miLibroCalificaciones.establecerNombreDelCurso( elNombre );
        System.out.println();
        miLibroCalificaciones.mostrarMensaje();

    }


}
