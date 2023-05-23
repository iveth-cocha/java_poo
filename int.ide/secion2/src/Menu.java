public class Menu {
    public static void main(String[] args){
        //calse obj  = new clase
        transporte barco = new transporte();
        transporte avion = new transporte();
        transporte taxi = new transporte();
        transporte bicicleta = new transporte();
        transporte bus = new transporte();

        //llamar solo para metodos
        System.out.println("avion:");
        avion.cobrar();
        System.out.println("barco:");
        barco.acelerar();
        System.out.println("taxi:");
        taxi.recorrer();
        System.out.println("bicicleta:");
        bicicleta.cobrar();
        System.out.println("bus:");
        bus.cobrar();
        
        //llamar atributos
        System.out.println("\tA T R I B U T O S ");
        System.out.print("avion,asientos:");
        System.out.println(avion.asientos);
        System.out.print("taxi,llantas: ");
        System.out.println(taxi.llantas);
        System.out.print("barco,capacidad: ");
        System.out.println(barco.capacidad);





    }
}
