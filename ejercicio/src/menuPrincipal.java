public class menuPrincipal {
    public static void main(String args[]){

        Bicicleta miBicicleta=new Bicicleta();
        Bicicleta tuBicicleta=new Bicicleta();
        Bicicleta nuestraBicicleta=new Bicicleta();

        //seteo
        miBicicleta.establcerMarcha(5);
        miBicicleta.establecerTipo("Montaña");
        tuBicicleta.establcerMarcha(3);
        tuBicicleta.establecerTipo("Urbana");
        nuestraBicicleta.establcerMarcha(4);
        nuestraBicicleta.establecerTipo("Paseo");


        //obtener
        System.out.println("Bicicleta 1 >>" +"Marcha: "+miBicicleta.obtenerMarcha()+" Tipo: "+ miBicicleta.obtenerTipo());
        System.out.println("Bicicleta 2 >>" +"Marcha: "+tuBicicleta.obtenerMarcha()+" Tipo: "+ tuBicicleta.obtenerTipo());
        System.out.println("Bicicleta 3 >>" +"Marcha: "+nuestraBicicleta.obtenerMarcha()+" Tipo: "+ nuestraBicicleta.obtenerTipo());

    }
}
