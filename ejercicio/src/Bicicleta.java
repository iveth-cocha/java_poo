public class Bicicleta {
    String tipo;
    int marcha;
    //establecer o setters
    public void establecerTipo(String miTipo){
        tipo=miTipo;
    }
    public void establcerMarcha(int miMarcha){
        marcha=miMarcha;
    }
    // obtener o getters
    public String obtenerTipo(){
    return tipo;
    }
    public int obtenerMarcha(){
    return marcha;
    }
    public void imprimirTipo(){
        System.out.println("Tipo: "+tipo);

    }
    public void imprimirMarchas(){
        System.out.println("Marchas: "+marcha);
    }
}
