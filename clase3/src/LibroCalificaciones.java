public class LibroCalificaciones {
//1ro
    public void mostrarMensaje(String nombreCurso){
        System.out.print(("Bienvenido al libro de calificaciones: " + nombreCurso));
    }
    //2do
    private String nombreDelCurso;

    public void establecerNombreDelCurso(String nombre){
        nombreDelCurso=nombre;
    }

    public String obtenerNombreDelCurso (){
        return nombreDelCurso;
    }

    public void mostrarMensaje() {
        System.out.print("Bienvenido al libro de calificaciones para "+ obtenerNombreDelCurso());
    }

}
